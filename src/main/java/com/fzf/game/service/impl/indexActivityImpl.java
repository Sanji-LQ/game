package com.fzf.game.service.impl;

import com.fzf.game.domain.entity.Activity;
import com.fzf.game.domain.entity.ActivityType;
import com.fzf.game.mappers.ActivityMapper;
import com.fzf.game.mappers.ActivityTypeMapper;
import com.fzf.game.service.indexActivity;
import com.fzf.game.utils.ActivityMes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("indexActivity")
public class indexActivityImpl implements indexActivity {
    @Resource
    ActivityMapper activityMapper;
    @Resource
    ActivityTypeMapper activityTypeMapper;
    @Override
    public List<Activity> queryActivity(int typeId) {
        List<Activity> activities = activityMapper.queryActivity(typeId);
        return activities;
    }

    @Override
    public List<Activity> queryAll(int page,int size) {
        int newPage=(page-1)*size;
        List<Activity> activities = activityMapper.queryAll(newPage,size);
        return activities;
    }
}
