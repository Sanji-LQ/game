package com.fzf.game.mapper;

import com.fzf.game.domain.entity.Comment;
import com.fzf.game.domain.vo.CommentVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMapper {
    int saveComment(@Param("uid")int uid,
                    @Param("articleId") int articleId,
                    @Param("content")String content);

    int deleteComment(@Param("commentId")int commentId);

    List<CommentVo> findCommentByArticleId(@Param("articleId")int articleId);
}