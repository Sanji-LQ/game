package com.fzf.game.service.impl;

import com.fzf.game.domain.entity.Cart;
import com.fzf.game.mapper.CartMapper;
import com.fzf.game.service.CartService;

import javax.annotation.Resource;
import java.util.List;

public class CartServiceImpl implements CartService {
    @Resource
    CartMapper cartMapper;
    @Override
    public List<Cart> cartList(Cart cart) {
        return cartMapper.findCartByUid(cart);
    }

    @Override
    public int updateNumber(Cart cart, int op) {
        int i = 0;
        if (op==1){
            i = cartMapper.decreaseNumber(cart);
        }else if(op==2){
            i = cartMapper.increaseNumber(cart);
        }
        return i;
    }

    @Override
    public int deleteCart(Cart cart) {
        return cartMapper.deleteCart(cart);
    }

    @Override
    public int add(Cart cart) {
        //根据shopId和uId查询商品是否存在
        int i = 0;
        List<Cart> list =cartList(cart);
        if(list!=null && !"".equals(list)){
            i=cartMapper.addCarts(cart);
        }else {
            i=cartMapper.addCart(cart);
        }
        return i;
    }
}
