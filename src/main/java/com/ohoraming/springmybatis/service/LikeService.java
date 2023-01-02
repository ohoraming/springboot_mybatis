package com.ohoraming.springmybatis.service;

import com.ohoraming.springmybatis.domain.Like;
import com.ohoraming.springmybatis.domain.User;
import com.ohoraming.springmybatis.mapper.LikeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeService {

    @Autowired
    LikeMapper likeMapper;

    public List<Like> getLikeList() {
        return likeMapper.getLikeList();
    }

    public Integer getLike(int boardNum) {
        return likeMapper.getLike(boardNum);
    }

    public void insertLike(int boardNum, int userNum) {
        likeMapper.insertLike(boardNum, userNum);
    }

    public void deleteLike(int userNum, int boardNum) {
        likeMapper.deleteLike(userNum, boardNum);
    }

}
