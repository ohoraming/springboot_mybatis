package com.ohoraming.springmybatis.controller;

import com.ohoraming.springmybatis.domain.Board;
import com.ohoraming.springmybatis.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/board")
@RestController
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("/all")
    public List<Board> getBoardList() {
        return boardService.getBoardList();
    }
}
