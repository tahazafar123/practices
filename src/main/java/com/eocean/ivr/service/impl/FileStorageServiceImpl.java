package com.eocean.ivr.service.impl;

import com.eocean.ivr.service.FileStorageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Objects;

@Service
public class FileStorageServiceImpl implements FileStorageService {
    private Path fileStoragePath;
    private String fileStorageLocation;

    public FileStorageServiceImpl(@Value("${file.storage.location:temp}") String fileStorageLocation){
        this.fileStorageLocation = fileStorageLocation;
        fileStoragePath = Paths.get(fileStorageLocation).toAbsolutePath().normalize();
        try {
            Files.createDirectories(fileStoragePath);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public String storeFile(MultipartFile file) {
        String filename = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        Path filePath = Paths.get(fileStoragePath + "\\" +filename);
        try {
            Files.copy(file.getInputStream() , filePath , StandardCopyOption.REPLACE_EXISTING);
        }
        catch (Exception e ){
            throw new RuntimeException("Issue in creating file" , e);
        }
        return filename;
    }

    @Override
    public Resource downloadFile(String fileName) {
        Path path = Paths.get(fileStorageLocation).toAbsolutePath().resolve(fileName);
        Resource resource = null;

        try {
            resource = new UrlResource(path.toUri());
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }
        assert resource != null;
        if(resource.exists() && resource.isReadable()){
            return resource;
        }else {
            throw new RuntimeException("the file does not exist");
        }


    }
}
