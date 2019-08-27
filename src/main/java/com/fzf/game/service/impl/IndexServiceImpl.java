package com.fzf.game.service.impl;

import com.fzf.game.domain.entity.Article;
import com.fzf.game.domain.vo.ArticleTypeVo;
import com.fzf.game.mapper.ArticleMapper;
import com.fzf.game.mapper.ArticleTypeMapper;
import com.fzf.game.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class IndexServiceImpl implements IndexService {
    @Resource
    ArticleMapper articleMapper;

    /**
     *
     * @param type:表示要查询的文章类型，如果为null，就是查询综合文章
     * @param index:表示要查询的哪个页面的数据，如果为index，就是查询此类型的6篇文章，
     *             如果为null，就是查询此类型的所有文章
     * @return
     */
    @Override
    public List<Article> findArticleByType(String type,String index) {
        if(type.equals("综合")){
            type = null;
        }
        List<Article> articleList = articleMapper.findArticleByType(type,index);
        if (articleList!=null && articleList.size()>0) {
            return articleList;
        }
        return null;

    }
}
