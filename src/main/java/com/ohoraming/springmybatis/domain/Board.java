package com.ohoraming.springmybatis.domain;

import lombok.Data;

@Data
public class Board {
    private int id;
    private String title;
    private String file;
    private int likeCount;
}
