package com.fzf.game.domain.vo;



import com.fzf.game.domain.entity.Images;
import com.fzf.game.domain.entity.Shop;

import lombok.Data;

import java.util.List;

@Data
public class ShopVo extends Shop {
    private List<Images> shopImages;
}
