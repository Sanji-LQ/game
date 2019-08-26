package com.fzf.game.domain.entity;

import lombok.Data;

@Data
public class Shop {
    private Integer shopId;

    private String shopName;

    private Integer bigTypeId;

    private String shopDescripe;

    private Integer shopStock;

    private Double originalPrice;

    private Double presentPrice;
}