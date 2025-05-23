package com.zplus.terablog.blog.links.service;

import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.common.base.service.BaseService;
import com.zplus.terablog.blog.links.domain.po.FriendshipLink;
import com.zplus.terablog.blog.links.domain.vo.FriendshipLinkVO;

/**
 *     blogs
 */
public interface FriendshipLinkService extends BaseService<FriendshipLink> {

    /**
     * 获取友情链接列表
     * @return
     */
    Result getFriendshipLinkList(FriendshipLinkVO friendshipLinkVO);

    Result getFriendshipLinkMap(FriendshipLinkVO friendshipLinkVO);

    /**
     * 更新友情链接
     * @param friendshipLinkVO
     * @return
     */
    Result updateFriendshipLink(FriendshipLinkVO friendshipLinkVO);

    /**
     * 删除友情链接
     * @param id
     * @return
     */
    Result deleteFriendshipLink(Long id);

    /**
     * 新增友情链接
     * @param friendshipLinkVO
     * @return
     */
    Result saveFriendshipLink(FriendshipLinkVO friendshipLinkVO);

    Result getFriendshipLink(Long id);

}
