package com.fzf.game.controller;




import com.fzf.game.domain.entity.Shop;
import com.fzf.game.service.SearchServcie;
import com.vip.bdshop.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class SearchContoller {
    @Resource
    SearchServcie searchServcie;

    /**
     *搜索功能
     */
    @GetMapping("/search")
    public Result<List<Shop>> search(String  keyword){
        try {
            List<Shop> search = searchServcie.search(keyword);
            return Result.success(search);
        } catch (Exception e){
            return Result.error();
        }
    }



    /**
     * 分页
     */
    @RequestMapping("/list")
    public void  testPage(int page, int size){

    }
}
