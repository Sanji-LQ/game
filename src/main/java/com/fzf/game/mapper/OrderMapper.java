package com.fzf.game.mapper;

import com.fzf.game.domain.entity.Cart;
import com.fzf.game.domain.vo.OrdersVo;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    int createOrder(@Param("cart") Cart cart, @Param("totalPrice")int totalPrice);
    OrdersVo findOrder(@Param("orderId")int orderId);
    int cancleOrder(@Param("orderId")int orderId);
    int completeOrder(@Param("orderId")int orderId);
}