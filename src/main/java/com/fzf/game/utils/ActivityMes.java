package com.fzf.game.utils;

import com.fzf.game.domain.entity.Activity;
import com.fzf.game.domain.entity.ActivityType;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ActivityMes implements Serializable {
    List<ActivityType> activityType;
    List<Activity> activityList;
}
