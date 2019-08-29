package com.fzf.game.domain.entity;

import lombok.Data;

@Data
public class User {
    private Integer uid;

    private String userName;

    private String password;
}