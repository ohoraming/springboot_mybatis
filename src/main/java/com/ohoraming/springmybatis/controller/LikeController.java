package com.ohoraming.springmybatis.controller;

import com.ohoraming.springmybatis.domain.Board;
//import com.ohoraming.springmybatis.domain.Like;
import com.ohoraming.springmybatis.domain.Like;
import com.ohoraming.springmybatis.domain.User;
import com.ohoraming.springmybatis.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/like")
@RestController
public class LikeController {

    @Autowired
    LikeService likeService;

    @GetMapping("/all")
    public List<Like> getLikeList() {
        return likeService.getLikeList();
    }

    @GetMapping
    public Integer getLike(int boardNum) {
        return likeService.getLike(boardNum);
    }

    @PostMapping("/new")
    public List<Like> insertLike(int boardNum, int userNum) { // body로 들어오는 JSON 가져옴
        likeService.insertLike(boardNum, userNum);
        return likeService.getLikeList();
    }

    /*
    http://localhost:8080/api/v1/like/2/2
     */
    @DeleteMapping("/{userNum}/{boardNum}")
    public Boolean deleteLike(@PathVariable int userNum, @PathVariable int boardNum) {
        likeService.deleteLike(userNum, boardNum);
        return true;
    }
}
