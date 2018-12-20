package com.helixz.s3.demo.controller;

import com.helixz.s3.demo.service.DocumentManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author Chamith
 */
@RestController
public class DocumentController {

    @Autowired
    private DocumentManagementService documentManagementService;

    @PostMapping("${app.endpoint.uploadFiles}")
    public void uploadMultipleFiles(@ModelAttribute List<MultipartFile> files) {
        documentManagementService.uploadMultipleFiles(files);
    }
}