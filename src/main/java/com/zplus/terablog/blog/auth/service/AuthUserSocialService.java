package com.zplus.terablog.blog.auth.service;


import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.common.base.service.BaseService;
import com.zplus.terablog.blog.auth.domain.po.AuthUserSocial;
import com.zplus.terablog.blog.auth.domain.vo.AuthUserSocialVO;

/**
 * 用户表社交信息表:业务接口类
 * @author nosum
 */
public interface AuthUserSocialService extends BaseService<AuthUserSocial> {

    Result saveAuthUserSocial(AuthUserSocialVO authUserSocialVO);

    Result editAuthUserSocial(AuthUserSocialVO authUserSocialVO);

    Result getSocial(Long id);

    Result getSocialList(AuthUserSocialVO authUserSocialVO);

    Result getSocialInfo();

    Result delSocial(Long id);
}