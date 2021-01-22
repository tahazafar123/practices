package com.eocean.ivr.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Multipart;

public interface FileStorageService {
    String storeFile(MultipartFile file);

    Resource downloadFile(String fileName);
}
