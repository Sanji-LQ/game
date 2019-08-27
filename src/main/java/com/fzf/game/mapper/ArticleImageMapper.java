package com.fzf.game.mapper;

import com.fzf.game.domain.entity.ArticleImage;

public interface ArticleImageMapper {
    int deleteByPrimaryKey(Integer articleImageId);

    int insert(ArticleImage record);

    int insertSelective(ArticleImage record);

    ArticleImage selectByPrimaryKey(Integer articleImageId);

    int updateByPrimaryKeySelective(ArticleImage record);

    int updateByPrimaryKey(ArticleImage record);
}