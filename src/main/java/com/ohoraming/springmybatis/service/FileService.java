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

    public String uploadFile(MultipartFile file) throws IOException {
        String original = file.getOriginalFilename();
        if (!file.isEmpty()) {
            log.debug("/file name = {}", original);
            log.debug("file content type= {}", file.getContentType());
            file.transferTo(new java.io.File(original));
        }
        return original;
    }

    public void insertFile(int boardNum, String filename) {
        fileMapper.insertFile(boardNum ,filename);
    }
}
