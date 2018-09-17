package com.omt.common.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangbl on 2018/6/25.
 */
@RestController
public class FileUDController {
    @Value("${uploadFileService}")
    private String uploadFileService;
    private RestTemplate restTemplate;
    public FileUDController() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setBufferRequestBody(false);
        this.restTemplate = new RestTemplate(requestFactory);
    }
    //文件下载
    @GetMapping("/fileLoad/{pathValue}/{fileName:.+}")
    @ResponseBody
    public ResponseEntity<Resource> serveFile(@PathVariable String fileName, @PathVariable("pathValue")String pathValue, String oa_file) {
        MultiValueMap<String,Object> parts = new LinkedMultiValueMap<String,Object>();
        parts.add("filename",fileName);
        parts.add("pathValue",pathValue);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        HttpEntity<MultiValueMap<String,Object>> request = new HttpEntity<MultiValueMap<String,Object>>(parts, headers);
        ResponseEntity<Resource> responseEntity=restTemplate.exchange("http://"+uploadFileService+"/fileG", HttpMethod.POST, request, Resource.class);
        Resource file = responseEntity.getBody();
        String filename="";
        try {
            filename = new String(fileName.getBytes("GBK"), "iso8859-1");
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + filename)
                //.contentType(new MediaType("image/jpeg"))
                .body(file);
    }
    //文件上传
    @RequestMapping("/fileUpload")
    public Map<String,String> handleFileUpload(@RequestParam("file") MultipartFile file, String related_id,
                                               RedirectAttributes redirectAttributes) {
        System.out.println("(related_id="+related_id+"{file=}"+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("\\")+1));
        MultiValueMap<String,Object> parts = new LinkedMultiValueMap<String,Object>();
        //真实名称
        String filename="";
        //转码后的名称
        String fileName="";
        Map<String,String> map=new HashMap<String,String>();
        try {
            if(file.getOriginalFilename().lastIndexOf("\\")>0) {
                filename=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("\\") + 1);
                fileName = URLEncoder.encode(filename, "UTF-8");
            }else {
                filename = file.getOriginalFilename();
                fileName = URLEncoder.encode(filename, "UTF-8");
            }
            parts.add("file", new MultipartInputStreamFileResource(file.getInputStream(),fileName));

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.MULTIPART_FORM_DATA);
            HttpEntity<MultiValueMap<String,Object>> request = new HttpEntity<MultiValueMap<String,Object>>(parts, headers);
            ResponseEntity<Map> responseEntity=restTemplate.exchange("http://"+uploadFileService+"/fileU", HttpMethod.POST, request, Map.class);
            map=responseEntity.getBody();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return map;
    }
    private class MultipartInputStreamFileResource extends InputStreamResource {

        private final String filename;

        public MultipartInputStreamFileResource(InputStream inputStream, String filename) {
            super(inputStream);
            this.filename = filename;
        }
        @Override
        public String getFilename() {
            return this.filename;
        }

        @Override
        public long contentLength() throws IOException {
            return -1; // we do not want to generally read the whole stream into memory ...
        }
    }
}
