package com.omt.common.storage;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.List;

public interface StorageService {

    void init();

    void store(MultipartFile file, String pathValue);

    Path load(String filename);

    Resource loadAsResource(String filename, String pathValue);
    Resource loadAsResource(String filename);

    void deleteAll();
    void delete(String pathValue, String fileName);
    public List<AnnexDto> selectAnnexInfo(AnnexDto param);

}
