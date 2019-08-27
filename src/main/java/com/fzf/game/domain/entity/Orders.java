package com.fzf.game.domain.entity;

import lombok.Data;

@Data
public class Orders {
    private Integer orderId;

    private Integer uid;

    private Double totalPrice;

    /*0为未支付 1为已支付 2为取消订单
    * */
    private Integer status;
}