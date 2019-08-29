package com.fzf.game.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Comment {
    private Integer commentId;

    private Integer uid;

    private Integer articleId;

    private String content;

    private Date creatTime;

    /**
    * 0表示没删除，1表示删除
    */
    private Integer isDelete;
}