package com.zplus.terablog.blog.auth.dao;

import com.zplus.terablog.common.base.dao.BaseDao;
import com.zplus.terablog.blog.auth.domain.po.AuthUser;

public interface AuthUserDao extends BaseDao<AuthUser> {

    String selectAvatar();
    AuthUser selectAdmin();

}
