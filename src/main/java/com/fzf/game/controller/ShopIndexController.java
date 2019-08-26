package com.fzf.game.controller;


import com.fzf.game.domain.entity.Shop;
import com.fzf.game.domain.vo.ShopVo;
import com.fzf.game.service.IndexService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vip.bdshop.utils.Result;


import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/game/shop")
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
     * 首页分类下商品信息
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
     * 每个分类的商品
     */
    @GetMapping(value = "/contentList",params = {"id","i","page","size"})
    public Result findShop(int id ,int i,int page,int size){
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
