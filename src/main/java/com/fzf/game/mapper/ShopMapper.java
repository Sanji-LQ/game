package com.fzf.game.mapper;


import com.fzf.game.domain.entity.Shop;
import com.fzf.game.domain.vo.ShopVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper {
    List<Shop> findAll(@Param("page")int page, @Param("size")int size);
    List<Shop> findByKeyWord(@Param("keyword") String keyword);
    ShopVo findShop(@Param("shopId") int shopId);

}