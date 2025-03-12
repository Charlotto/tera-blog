package com.zplus.terablog.blog.posts.controller;

import com.zplus.terablog.common.annotation.LoginRequired;
import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.blog.posts.domain.validator.InsertPostsComments;
import com.zplus.terablog.blog.posts.domain.validator.QueryPostsComments;
import com.zplus.terablog.blog.posts.domain.vo.PostsCommentsVO;
import com.zplus.terablog.blog.posts.service.PostsCommentsService;
import com.zplus.terablog.system.enums.RoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 *     blogs
 */
@RestController
@RequestMapping("/comments")
public class PostsCommentsController {

    @Autowired
    private PostsCommentsService postsCommentsService;

    @LoginRequired(role = RoleEnum.USER)
    @PostMapping("/comments/v1/add")
    public Result savePostsComments(@Validated({InsertPostsComments.class}) @RequestBody PostsCommentsVO postsCommentsVO) {
        return this.postsCommentsService.savePostsComments(postsCommentsVO);
    }

    @LoginRequired(role = RoleEnum.USER)
    @PostMapping("/admin/v1/reply")
    public Result replyComments(@RequestBody PostsCommentsVO postsCommentsVO) {
        return this.postsCommentsService.replyComments(postsCommentsVO);
    }

    @LoginRequired
    @DeleteMapping("/comments/v1/{id}")
    public Result deletePostsComments(@PathVariable(value = "id") Long id) {
        return this.postsCommentsService.deletePostsComments(id);
    }

    @LoginRequired
    @GetMapping("/comments/v1/{id}")
    public Result getPostsComment(@PathVariable(value = "id") Long id) {
        return this.postsCommentsService.getPostsComment(id);
    }

    @GetMapping("/comments-posts/v1/list")
    public Result getPostsCommentsByPostsIdList(@Validated({QueryPostsComments.class}) PostsCommentsVO postsCommentsVO) {
        return this.postsCommentsService.getPostsCommentsByPostsIdList(postsCommentsVO);
    }

    @LoginRequired
    @GetMapping("/comments/v1/get")
    public Result getPostsCommentsList(PostsCommentsVO postsCommentsVO) {
        return this.postsCommentsService.getPostsCommentsList(postsCommentsVO);
    }
}
