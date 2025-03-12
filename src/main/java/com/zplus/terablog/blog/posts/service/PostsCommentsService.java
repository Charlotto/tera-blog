package com.zplus.terablog.blog.posts.service;

import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.common.base.service.BaseService;
import com.zplus.terablog.blog.posts.domain.po.PostsComments;
import com.zplus.terablog.blog.posts.domain.vo.PostsCommentsVO;

/**
 * <p>
 * 评论表 服务类
 * </p>
 *     blogs
 */
public interface PostsCommentsService extends BaseService<PostsComments> {

    /**
     * 新增评论
     */
    Result savePostsComments(PostsCommentsVO postsCommentsVO);

    /**
     * 根据文章的主键查询评论列表
     */
    Result getPostsCommentsByPostsIdList(PostsCommentsVO postsCommentsVO);

    /**
     * 查询评论列表
     */
    Result getPostsCommentsList(PostsCommentsVO postsCommentsVO);

    /**
     * 删除评论
     */
    Result deletePostsComments(Long id);


    Result getPostsComment(Long id);

    Result replyComments(PostsCommentsVO postsCommentsVO);

}
