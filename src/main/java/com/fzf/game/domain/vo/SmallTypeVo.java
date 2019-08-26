package com.fzf.game.domain.vo;


import com.fzf.game.domain.entity.ConcreteType;
import com.fzf.game.domain.entity.SmallType;
import lombok.Data;
import java.util.List;

@Data
public class SmallTypeVo extends SmallType {
    List<ConcreteType>  concreteTypeList;
}
