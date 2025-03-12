package com.zplus.terablog.blog.posts.service;

import com.zplus.terablog.blog.posts.domain.vo.BlogMoveVO;

/**
 *     
 * @description:

 * @modified:
 */
public interface BlogPlatformService {

    String URL = "jdbc:mysql://%s:%s/%s?useSSL=false&characterEncoding=utf8";

    String MYSQL_DRIVER = "com.mysql.jdbc.Driver";

    /**
     * 获取url
     *
     * @param blogMoveVO
     * @return
     */
    String getUrl(BlogMoveVO blogMoveVO);

    /**
     * 获取统计sql
     *
     * @param blogMoveVO
     * @return
     */
    String getCountSql(BlogMoveVO blogMoveVO);

    /**
     * 获取查询接口
     *
     * @param blogMoveVO
     * @return
     */
    String getQuerySql(BlogMoveVO blogMoveVO);

    /**
     * 获取驱动
     *
     * @return
     */
    String getDriver();
}
