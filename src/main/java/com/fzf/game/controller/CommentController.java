package com.fzf.game.controller;

import com.fzf.game.service.CommentService;
import com.fzf.game.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
    @Resource
    CommentService commentService;

    @RequestMapping("/save")
    Result saveComment(int uid, int articleId, String content){
        try {
            int i = commentService.saveComment(uid, articleId, content);
            if(i>0){
                return Result.success(i);
            }else {
                return Result.error();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error();
        }
    }

}
