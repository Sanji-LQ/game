package com.fzf.game.mapper;

import com.fzf.game.domain.entity.BigType;
import com.fzf.game.domain.entity.Shop;
import com.fzf.game.domain.vo.BigTypeVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BigTypeMapper {

    List<Shop> findByBigTypeId(@Param("bigTypeId") int bigTypeId, @Param("page")int page, @Param("size")int size);
    List<Shop> findBySmallTypeId(@Param("smallTypeId") int smallTypeId,@Param("page")int page,@Param("size")int size);

}