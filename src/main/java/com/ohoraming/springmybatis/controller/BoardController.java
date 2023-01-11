package com.ohoraming.springmybatis.controller;

import com.ohoraming.springmybatis.domain.Board;
import com.ohoraming.springmybatis.domain.User;
import com.ohoraming.springmybatis.service.BoardService;
import com.ohoraming.springmybatis.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RequestMapping("/api/v1/board")
@RestController
public class BoardController {

    @Autowired
    BoardService boardService;

    @Autowired
    FileService fileService;

    @GetMapping("/all")
    public List<Board> getBoardList() {
        return boardService.getBoardList();
    }

    @GetMapping
    public Board getBoard(@RequestParam String id) {
        return boardService.getBoard(id);
    }

    @GetMapping("/page")
    public List<Board> getBoardPage(@RequestParam Integer pageNum) {
        return boardService.getBoardPage(pageNum);
    }

    /*
    file 업로드
    http://localhost:8080/api/v1/file/upload
    Body: form-data
    KEY: file
    VALUE: file 선택
    KEY: boarNum
    VALUE: 1
     */

    @PostMapping("/new")
    public List<Board> insertBoard(MultipartFile file, String title) throws IOException {
        Board board = new Board();
        board.setTitle(title);
        boardService.insertBoard(board);
        List<Board> isId = boardService.getLastBoard();
        board.setId(isId.get(0).getId());
        String filename = fileService.uploadFile(file);
        fileService.insertFile(board.getId(), filename);
        return boardService.getBoardList();
    }

    @PutMapping("/{id}")
    public Board updateBoard(@PathVariable String id, String title) {
        boardService.updateBoard(id, title);
        return boardService.getBoard(id);
    }

    @DeleteMapping("/{id}")
    public List<Board> deleteBoard(@PathVariable String id) {
        boardService.deleteBoard(id);
        return boardService.getBoardList();
    }
}
