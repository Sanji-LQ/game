package com.fzf.game.mapper;

import com.fzf.game.domain.entity.Cart;
import com.fzf.game.domain.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    List<Cart> findCartByUid(@Param("cart")  Cart cart);
    int addCart(@Param("cart") Cart cart);
    int addCarts(@Param("cart") Cart cart);
    int increaseNumber(@Param("cart") Cart cart);
    int decreaseNumber(@Param("cart") Cart cart);
    int deleteCart(@Param("cart") Cart cart);
}