package com.fzf.game.mappers;


import com.fzf.game.domain.entity.Activity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityMapper {

    //查询首页第二栏活动信息
    List<Activity> queryActivity(@Param("typeId") int typeId);
}