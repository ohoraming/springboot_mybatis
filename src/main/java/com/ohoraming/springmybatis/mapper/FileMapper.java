package com.ohoraming.springmybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FileMapper {
    void insertFile(@Param("boardNum") String boardNum, @Param("fileName") String fileName);
}
