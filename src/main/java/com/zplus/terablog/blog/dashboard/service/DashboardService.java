package com.zplus.terablog.blog.dashboard.service;

import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.blog.log.domain.vo.AuthUserLogVO;

/**
 *    

 */
public interface DashboardService {

    /**
     * 评论数量统计
     *
     * @return
     */
    Result getPostsQuantityTotal();

    /**
     * 获取浏览量折线图
     *
     * @return
     */
    Result getPostsStatistics(AuthUserLogVO authUserLogVO);

    /**
     * 获取文章排名
     *
     * @return
     */
    Result getPostsRanking(AuthUserLogVO authUserLogVO);
}
