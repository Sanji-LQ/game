package com.fzf.game.service;

import com.fzf.game.domain.entity.Activity;
import com.fzf.game.utils.ActivityMes;

import java.util.List;

public interface indexActivity {
    public List<Activity>  queryActivity(int typeId);
    public List<Activity> queryAll(int page,int size);
}
