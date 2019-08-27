package com.fzf.game.controller;


import com.fzf.game.domain.entity.Shop;
import com.fzf.game.domain.vo.ShopVo;
import com.fzf.game.service.IndexService;
import com.fzf.game.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/game/v1")
public class ShopIndexController {
    @Resource
    IndexService indexService;

    /**
     * 导航  菜单  轮播
     *
     * @return
     */
    @GetMapping("/heads")
    public Result getHeaderData() {
        try {
//            CateBean cateBean = indexService.getHeader();
            return Result.success(null);
        } catch (Exception ex) {
            return Result.error();
        }
    }

    /**
     * 首页分类下商品信息展示
     *
     * @return
     */
    @GetMapping(value = "/content", params ="id")
    public Result getContentData(int id) {
        try {
            List<Shop> shops = indexService.getContentData(id,0,0);
            return Result.success(shops);
        }catch (Exception e){
            return Result.error();
        }
    }

    /**
     *
     * 全部商品
     *
     * 每个分类的商品
     */
    @GetMapping(value = "/contentList")
    public Result findShop(@RequestParam(value = "id",defaultValue = "0")int id
            ,@RequestParam(value = "i",defaultValue = "0")int i
            ,@RequestParam(value = "page",defaultValue = "0") int page
            ,@RequestParam(value = "size",defaultValue = "0") int size){
        try{
            List<Shop> shops = indexService.findShop(id,i,page,size);
            return Result.success(shops);
        }catch (Exception e){
            return Result.error();
        }
    }

    /**
     *
     *商品详情
     *
     * */
    @GetMapping(value = "/shopDetails",params = "shopId")
    public Result shopDetails(int shopId){
        try{
            ShopVo shopVo =indexService.shopDetails(shopId);
            return Result.success(shopVo);
        }catch (Exception e){
            return Result.error();
        }
    }
}
