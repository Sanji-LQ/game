package com.fzf.game.service.impl;

import com.fzf.game.domain.entity.Article;
import com.fzf.game.mapper.ArticleMapper;
import com.fzf.game.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    ArticleMapper articleMapper;


    @Override
    public List<Article> findArticleById(int id) {
        List<Article> articleList = articleMapper.findArticleById(id);
        if(articleList!=null && articleList.size()>0){
            return articleList;
        }
        return null;
    }


}
