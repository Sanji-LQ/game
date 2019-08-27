package com.fzf.game.mapper;

import com.fzf.game.domain.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper {
    List<Article> findArticleByType(@Param("typeName") String typeName,
                                    @Param("index") String index);

    List<Article> findArticleById(@Param("id")int id);

}