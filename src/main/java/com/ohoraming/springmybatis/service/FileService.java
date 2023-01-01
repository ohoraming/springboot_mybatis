package com.ohoraming.springmybatis.service;

import com.ohoraming.springmybatis.mapper.FileMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@Slf4j
@Service
public class FileService {

    @Autowired
    FileMapper fileMapper;

    @Value("${spring.servlet.multipart.location")
    private String uploadPath;

    public String uploadFile(MultipartFile file) throws IOException {
        System.out.println("it's upload mapping!");
        String original = file.getOriginalFilename();
        if (!file.isEmpty()) {
            log.debug("/file name = {}", original);
            log.debug("file content type= {}", file.getContentType());
            file.transferTo(new java.io.File(original));
        }
        return original;
    }

    public void insertFile(String boardNum, String filename) {
        fileMapper.insertFile(boardNum ,filename);
    }
}
