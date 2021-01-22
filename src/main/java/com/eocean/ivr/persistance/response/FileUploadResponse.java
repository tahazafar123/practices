package com.eocean.ivr.persistance.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class FileUploadResponse {
    private String fileName;
    private String contentType;
    private String url;

}
