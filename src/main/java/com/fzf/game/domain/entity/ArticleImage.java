package com.fzf.game.domain.entity;

import lombok.Data;

@Data
public class ArticleImage {
    private Integer articleImageId;

    /**
    * 文章表外键
    */
    private Integer articleId;

    /**
    * 图片路径
    */
    private String articleImaeUrl;
}