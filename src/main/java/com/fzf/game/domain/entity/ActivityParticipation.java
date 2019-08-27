package com.fzf.game.domain.entity;

import lombok.Data;

@Data
public class ActivityParticipation {
    private Integer apId;

    private Integer userId;

    private Integer activityId;

    private Integer status;
}