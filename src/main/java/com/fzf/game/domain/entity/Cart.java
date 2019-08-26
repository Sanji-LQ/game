package com.fzf.game.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Cart {
    private Integer cartId;

    private Integer num;

    private Integer uid;

    private Integer shopId;

    private Date createDate;

    /**
    * 0为未支付
1为已支付
    */
    private Integer status;

    /**
    * 0为存在 1为假删除
    */
    private Integer isDelete;
}