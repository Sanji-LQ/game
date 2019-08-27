package com.fzf.game.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Activity {
    private Integer activityId;

    private Integer activityTypeId;

    private String activityName;

    private Date activityCreateTime;

    private Date activityDeadTime;

    private String activityIntroduce;

    private String activityTitle;

    private String activityImage;

    private String rewordImage;

    private Integer isDelete;
}