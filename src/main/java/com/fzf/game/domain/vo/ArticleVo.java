package com.fzf.game.domain.vo;

import com.fzf.game.domain.entity.Article;
import com.fzf.game.domain.entity.ArticleImage;
import com.fzf.game.domain.entity.ArticleType;
import lombok.Data;

import java.util.List;

@Data
public class ArticleVo extends Article {
    private ArticleType articleType;
    private List<ArticleImage> articleImageList;
}
