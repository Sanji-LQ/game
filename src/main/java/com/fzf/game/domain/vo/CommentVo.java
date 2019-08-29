package com.fzf.game.domain.vo;

import com.fzf.game.domain.entity.Comment;
import com.fzf.game.domain.entity.User;
import lombok.Data;

@Data
public class CommentVo extends Comment {
    private User user;
}
