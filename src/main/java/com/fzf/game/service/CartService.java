package com.fzf.game.service;

import com.fzf.game.domain.entity.Cart;

import java.util.List;

public interface CartService {
    List<Cart> cartList(Cart cart);

    int updateNumber(Cart cart, int op);

    int deleteCart(Cart cart);

    int add(Cart cart);
}
