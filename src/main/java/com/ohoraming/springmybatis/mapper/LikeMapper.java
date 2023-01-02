package com.ohoraming.springmybatis.mapper;

import com.ohoraming.springmybatis.domain.Like;
import com.ohoraming.springmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LikeMapper {
    List<Like> getLikeList();
    Integer getLike(int boardNum);
    void insertLike(@Param("boardNum") int boardNum, @Param("userNum") int userNum);
    void deleteLike(@Param("userNum") int userNum, @Param("boardNum") int boardNum);
}
