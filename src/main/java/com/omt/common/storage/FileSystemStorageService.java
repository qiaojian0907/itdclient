package com.omt.common.storage;

import com.omt.common.dataBase.SqlE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.*;
import java.util.List;

@Service
public class FileSystemStorageService implements StorageService {

    private  Path rootLocation;

    @Autowired
    public FileSystemStorageService(StorageProperties properties) {
        this.rootLocation = Paths.get(properties.getLocation());
    }
    @Autowired
    SqlE sqlE;
    @Override
    public void store(MultipartFile file, String pathValue) {
        try {
            this.rootLocation = Paths.get("upload-dir/"+pathValue);
            init();
            if (file.isEmpty()) {
                throw new StorageException("Failed to store empty file " + file.getOriginalFilename());
            }
            String fileName= file.getOriginalFilename();
            System.out.println("文件名称="+fileName);
           /* System.out.println("1文件名称="+java.net.URLEncoder.encode(fileName,"UTF-8"));
            System.out.println("2文件名称="+java.net.URLDecoder.decode(fileName, "UTF-8"));
            //为了获得中文此处做了一次编码，两次解码,在weblogic中部署不需要此处代码
            fileName=java.net.URLEncoder.encode(fileName,"UTF-8");
            System.out.println("3文件名称="+fileName);
            fileName=java.net.URLDecoder.decode(fileName, "UTF-8");
            System.out.println("4文件名称="+fileName);
            fileName=java.net.URLDecoder.decode(fileName, "UTF-8");
            System.out.println("5文件名称="+fileName);*/
            //delete("");
            //在附件表中增加附件信息
            if(!pathValue.substring(pathValue.length()-8).equals("homework")) {
                AnnexDto annexDto = new AnnexDto();
                annexDto.setAnnex_name(fileName);
                annexDto.setPath(pathValue);
                sqlE.insertM("insertAnnexInfo", annexDto);
            }
            System.out.println("---测试---"+Files.exists(this.rootLocation,
                    new LinkOption[]{ LinkOption.NOFOLLOW_LINKS}));
            Files.copy(file.getInputStream(), this.rootLocation.resolve(fileName),StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new StorageException("Failed to store file " + file.getOriginalFilename(), e);
        }
    }
/*
    @Override
    public Stream<Path> loadAll() {
        try {
            return Files.walk(this.rootLocation, 1)
                    .filter(path -> !path.equals(this.rootLocation))
                    .map(path -> this.rootLocation.relativize(path));
        } catch (IOException e) {
            throw new StorageException("Failed to read stored files", e);
        }

    }*/

    @Override
    public Path load(String filename) {
        return rootLocation.resolve(filename);
    }

    @Override
    public Resource loadAsResource(String filename, String pathValue) {
        try {this.rootLocation = Paths.get("upload-dir/"+pathValue);
            Path file = load(filename);
            Resource resource = new UrlResource(file.toUri());
            if(resource.exists() || resource.isReadable()) {
                return resource;
            }
            else {
                throw new StorageFileNotFoundException("Could not read file: " + filename);

            }
        } catch (MalformedURLException e) {
            throw new StorageFileNotFoundException("Could not read file: " + filename, e);
        }
    }
    @Override
    public Resource loadAsResource(String filename) {
        try {
            Path file = load(filename);
            Resource resource = new UrlResource(file.toUri());
            if(resource.exists() || resource.isReadable()) {
                return resource;
            }
            else {
                throw new StorageFileNotFoundException("Could not read file: " + filename);

            }
        } catch (MalformedURLException e) {
            throw new StorageFileNotFoundException("Could not read file: " + filename, e);
        }
    }

    @Override
    public void deleteAll() {
        FileSystemUtils.deleteRecursively(rootLocation.toFile());
    }
    @Override
    public void delete(String pathValue,String fileName) {
        //Path path = Paths.get(pathValue);
        Path path = Paths.get("upload-dir/"+pathValue+"/"+fileName);
        try {
            //删除目录
            /*Files.walk(path, FileVisitOption.FOLLOW_LINKS)
                    .sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .peek(System.out::println)
                    .forEach(File::delete);*/
            //删除单个文件
            //从附件表中删除附件信心
            Files.delete(path);
            AnnexDto annexDto=new AnnexDto();
            annexDto.setAnnex_name(fileName);
            annexDto.setPath(pathValue);
            sqlE.deleteM("deleteAnnexInfo",annexDto);
        } catch (IOException e) {
            //deleting file failed
            e.printStackTrace();
        }
    }

    //查询附件列表信息
    public List<AnnexDto> selectAnnexInfo(AnnexDto param){
        return sqlE.selectM("selectAnnexInfo",param);
    }
    @Override
    public void init() {
        try {
            //Files.createDirectory(rootLocation);
            Files.createDirectories(rootLocation);//在linux操作系统下应使用createDirectories方法
        } catch (IOException e) {
            throw new StorageException("Could not initialize storage", e);
        }
    }
}
