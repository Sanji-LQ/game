package com.fzf.game.controller;


import com.fzf.game.domain.entity.Article;
import com.fzf.game.domain.vo.ArticleTypeVo;
import com.fzf.game.service.IndexService;
import com.fzf.game.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/index")
public class IndexController {
    @Resource
    IndexService indexService;

    @RequestMapping("/findArticleByType")
    Result findArticleByType(String type,String index){
        try {
            List<Article> articleList = indexService.findArticleByType(type,index);
            if(articleList!=null && articleList.size()>0){
                return Result.success(articleList);
            }
            return Result.error();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error();
        }
    }


}
