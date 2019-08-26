package com.fzf.game.domain.vo;


import com.fzf.game.domain.entity.BigType;
import com.fzf.game.domain.entity.Shop;
import com.fzf.game.domain.entity.SmallType;
import lombok.Data;
import java.util.List;

@Data
public class BigTypeVo extends BigType {

    List<SmallType>  SmallTypeList;
    List<Shop> shops;

}
