package com.fzf.game.mapper;

import com.fzf.game.domain.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuMapper {
    int createMenu(@Param("orderId") int orderId, @Param("cartId")int cartId);
    List<Menu> findMenu(@Param("orderId")int orderId);
}