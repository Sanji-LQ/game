package com.fzf.game.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Article {
    private Integer articleId;

    /**
    * 文章类型表外键
    */
    private Integer aarticleTypeId;

    /**
    * 文章内容
    */
    private String content;

    /**
    * 文章标题
    */
    private String articleTitle;

    /**
    * 文章发布时间
    */
    private Date createTime;
}