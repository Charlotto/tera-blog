package com.zplus.terablog.blog.auth.service;

import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.blog.auth.domain.vo.AuthUserVO;

/**
 * @description:
 * @author: byteblogs
 * @date: 2019/09/04 08:58
 */
public interface OauthService {

    /**
     * 获取授权链接
     */
    Result oauthLoginByGithub();

    /**
     * 根据code获取用户信息
     *
     * @param code
     * @return
     */
    String saveUserByGithub(String code, String state);

    /**
     * 保存用户信息
     */
    Result saveUserByGithub(AuthUserVO authUserVO);

    /**
     * 保存管理员
     */
    Result login(AuthUserVO authUserVO);

    /**
     * 注册管理员
     *
     * @param authUserVO
     * @return
     */
    Result registerAdmin(AuthUserVO authUserVO);

    /**
     * 保存管理员
     */
    Result updatePassword(AuthUserVO authUserVO);

    String getAuthorizeUrl(String state);

    String getAccessToken(String code);

    String getUserInfo(String accessToken);

}
