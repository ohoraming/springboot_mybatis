package com.ohoraming.springmybatis.mapper;

import com.ohoraming.springmybatis.domain.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<Board> getBoardList();
    Board getBoard(String id);
    List<Board> getBoardPage(Integer pageNum);
    Integer insertBoard(Board board);
    void updateBoard(Board board);
    void deleteBoard(String id);
    List<Board> getLastBoard();
}
