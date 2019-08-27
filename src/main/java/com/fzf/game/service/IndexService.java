package com.fzf.game.service;

import com.fzf.game.domain.entity.Article;
import com.fzf.game.domain.vo.ArticleTypeVo;

import java.util.List;

public interface IndexService {
    List<Article> findArticleByType(String type,String index);

}
