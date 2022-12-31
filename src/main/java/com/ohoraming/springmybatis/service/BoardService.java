package com.ohoraming.springmybatis.service;

import com.ohoraming.springmybatis.domain.Board;
import com.ohoraming.springmybatis.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    BoardMapper boardMapper;

    public List<Board> getBoardList() {
        return boardMapper.getBoardList();
    }
    public Board getBoard(String id) {
        return boardMapper.getBoard(id);
    }

    public void insertBoard(Board board) {
        boardMapper.insertBoard(board);
    }
}
