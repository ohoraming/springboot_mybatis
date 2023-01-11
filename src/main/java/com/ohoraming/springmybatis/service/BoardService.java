package com.ohoraming.springmybatis.service;

import com.ohoraming.springmybatis.domain.Board;
import com.ohoraming.springmybatis.domain.User;
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

    public List<Board> getBoardPage(Integer pageNum) {
        Integer startPage = 5 * (pageNum - 1);
        return boardMapper.getBoardPage(startPage);
    }

    public void insertBoard(Board board) {
        boardMapper.insertBoard(board);
    }

    public void updateBoard(String id, String title) {
        Board board = boardMapper.getBoard(id);
        if (board != null) {
            board.setTitle(title);
            boardMapper.updateBoard(board);
        } else {
            throw new IllegalStateException("게시글이 존재하지 않습니다.");
        }
    }

    public void deleteBoard(String id) {
        if (boardMapper.getBoard(id) != null) {
            boardMapper.deleteBoard(id);
        } else {
            throw new IllegalStateException("게시글이 존재하지 않습니다.");
        }
    }
    public List<Board> getLastBoard() {
        return boardMapper.getLastBoard();
    }
}
