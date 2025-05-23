package com.zplus.terablog.blog.auth.service;

import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.common.base.service.BaseService;
import com.zplus.terablog.blog.auth.domain.po.AuthUser;
import com.zplus.terablog.blog.auth.domain.vo.AuthUserVO;

/**
 *     blogs
 */
public interface AuthUserService extends BaseService<AuthUser> {

    /**
     * 获取用户信息
     *
     * @param authUserVO
     * @return
     */
    Result getUserInfo(AuthUserVO authUserVO);

    /**
     * 获取作者信息
     *
     * @return
     */
    Result getAuthorUserInfo();

    /**
     * 获取用户列表
     *
     * @param authUserVO
     * @return
     */
    Result getUserList(AuthUserVO authUserVO);

    /**
     * 退出登录
     *
     * @return
     */
    Result logout();

    /**
     * 更新管理员个人资料
     *
     * @param authUserVO
     * @return
     */
    Result updateAdmin(AuthUserVO authUserVO);

    /**
     * 更新个人资料
     *
     * @param authUserVO
     * @return
     */
    Result updateUser(AuthUserVO authUserVO);

    Result updateAuthUserStatus(AuthUserVO authUserVO);

    Result deleteUsers(Long id);

    String getAvatar();
}
