package com.fzf.game.mapper;

import com.fzf.game.domain.entity.Images;
import com.fzf.game.domain.entity.Img;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImgMapper {
    List<Images> findShopImg(@Param("shopId") int shopId);

}