package com.fzf.game.service.impl;

import com.fzf.game.mapper.CommentMapper;
import com.fzf.game.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    CommentMapper commentMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int saveComment(int uid, int articleId, String content) {
        return commentMapper.saveComment(uid, articleId, content);
    }


}
