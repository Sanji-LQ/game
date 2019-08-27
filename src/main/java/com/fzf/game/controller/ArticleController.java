package com.fzf.game.controller;

import com.fzf.game.domain.entity.Article;
import com.fzf.game.service.ArticleService;
import com.fzf.game.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/article")
public class ArticleController {
    @Resource
    ArticleService articleService;

    @RequestMapping("/findArticleById")
    Result findArticleById(Integer id){
        try {
            List<Article> articleList = articleService.findArticleById(id);
            if(articleList!=null && articleList.size()>0){
                return Result.success(articleList);
            }else {
                return Result.error();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error();
        }

    }


}
