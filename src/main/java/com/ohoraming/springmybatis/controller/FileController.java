package com.ohoraming.springmybatis.controller;

import com.ohoraming.springmybatis.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RequestMapping("/api/v1/file")
@RestController
public class FileController {

    @Autowired
    FileService fileService;

    /*
    file 업로드
    http://localhost:8080/api/v1/file/upload
    Body: form-data
    KEY: file
    VALUE: file 선택
    KEY: boarNum
    VALUE: 1
     */
    @PostMapping("/upload")
    public ResponseEntity<String> insertFile(MultipartFile file, String boardNum) throws IllegalStateException, IOException {
        String filename = fileService.uploadFile(file);

        fileService.insertFile(boardNum, filename);
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}