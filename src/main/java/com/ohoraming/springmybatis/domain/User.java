package com.ohoraming.springmybatis.domain;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String email;
    private String likes;
}
