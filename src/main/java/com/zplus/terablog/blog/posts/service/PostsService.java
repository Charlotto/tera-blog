package com.zplus.terablog.blog.posts.service;

import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.common.base.service.BaseService;
import com.zplus.terablog.blog.posts.domain.po.Posts;
import com.zplus.terablog.blog.posts.domain.vo.PostsVO;

/**
 *     blogs
 */
public interface PostsService extends BaseService<Posts> {

    /**
     * 保存文章
     * @param postsVO
     * @return
     */
    Result savePosts(PostsVO postsVO);

    /**
     * 编辑文章
     * @param postsVO
     * @return
     */
    Result updatePosts(PostsVO postsVO);

    /**
     * 删除文章
     * @param id
     * @return
     */
    Result deletePosts(Long id);

    /**
     * 查询单个文章
     * @param id
     * @return
     */
    Result getPosts(Long id);

    /**
     * 查询文章的列表
     * @param postsVO
     * @return
     */
    Result<PostsVO> getPostsList(PostsVO postsVO);

    /**
     * 博客搬家 抓取其他平台我的博客
     * @param postsVO
     * @return
     */
    Result getPlatformArticle(PostsVO postsVO);

    /**
     * 按照时间归档的文章数量
     */
    Result<PostsVO> getArchiveTotalByDateList(PostsVO postsVO);

    /**
     * 按照年维度查询带有文章标题的归档列表
     * @return
     */
    Result getArchiveGroupYearList(PostsVO postsVO);

    /**
     * 更新文章的状态
     * @param postsVO
     * @return
     */
    Result updatePostsStatus(PostsVO postsVO);


    Result getHotPostsList(PostsVO postsVO);
}
