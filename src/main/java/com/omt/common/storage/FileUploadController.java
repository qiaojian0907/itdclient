package com.omt.common.storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FileUploadController {

    private final StorageService storageService;
    //返回当前时间做为上传文件的存放目录
    public String getPathValue(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
        return sdf.format(new Date());
    }
    @Autowired
    public FileUploadController(StorageService storageService) {
        this.storageService = storageService;
    }
    //文件下载
    @PostMapping("/fileG")
    public Resource serveFile(String filename, String pathValue) {
        System.out.println(pathValue+"FileUploadController="+filename);
        Resource file = storageService.loadAsResource(filename,pathValue);
        return file;
    }
    //文件上传
    @PostMapping("/fileU")
    public Map<String,String> handleFileUpload(@RequestParam("file") MultipartFile file,String pathStr) {
        String pathValue ="";
        pathValue=pathStr;
        //获取文件存放目录，目录通过时间生成
        if(pathStr==null){
         pathValue = "files/test/"+getPathValue();
        }
        storageService.store(file,pathValue);
        Map result=new HashMap<String, String>();
        result.put("pathValue", pathValue);
        return result;
    }
    @GetMapping("/getFile")
    public ResponseEntity<Resource> getFile(String filename, String pathValue) {
        System.out.println(pathValue+"FileUploadController="+filename);
        Resource file = storageService.loadAsResource(filename,pathValue);
        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\""+file.getFilename()+"\"")
                .body(file);
    }
    @ExceptionHandler(StorageFileNotFoundException.class)
    public ResponseEntity handleStorageFileNotFound(StorageFileNotFoundException exc) {
        return ResponseEntity.notFound().build();
    }
}
