package com.fzf.game.domain.vo;



import com.fzf.game.domain.entity.Img;
import com.fzf.game.domain.entity.Shop;

import lombok.Data;

import java.util.List;

@Data
public class ShopVo extends Shop {
    private List<Img> shopImages;
}
