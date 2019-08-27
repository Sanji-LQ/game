package com.fzf.game.service;

import com.fzf.game.domain.entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> findArticleById(int id);

}
