package com.eocean.ivr.controller;

import com.eocean.ivr.persistance.response.FileUploadResponse;
import com.eocean.ivr.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping("/ivr-main-route")
public class IvrRoutingController {

    @Autowired
    private FileStorageService fileStorageService;

    @PostMapping("/file-uploading")
    public FileUploadResponse uploadFile(@RequestParam("file") MultipartFile file) {
     String fileName = fileStorageService.storeFile(file);
     String url = ServletUriComponentsBuilder.fromCurrentContextPath()
             .path("/ivr-routing/download/")
             .path(fileName)
             .toUriString();

     String contentType = file.getContentType();
     return FileUploadResponse.builder()
             .fileName(fileName)
             .contentType(contentType)
             .url(url)
             .build();


    }

    @GetMapping("/download/{fileName}")
    ResponseEntity<Resource> downLoadSingleFile(@PathVariable String fileName, HttpServletRequest request) {
        Resource resource = fileStorageService.downloadFile(fileName);
        String mimeType;
        try {
            mimeType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        }catch (IOException e){
            mimeType = MediaType.APPLICATION_OCTET_STREAM_VALUE;

        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(mimeType))
                //.header(HttpHeaders.CONTENT_DISPOSITION,  "attachment;fileName="+resource.getFilename())
                .header(HttpHeaders.CONTENT_DISPOSITION , "inline;fileName=" + resource.getFilename())
                .body(resource);
    }

}
