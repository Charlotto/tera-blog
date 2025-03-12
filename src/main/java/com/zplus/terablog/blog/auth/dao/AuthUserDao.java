package com.zplus.terablog.blog.auth.dao;

import com.zplus.terablog.common.base.dao.BaseDao;
import com.zplus.terablog.blog.auth.domain.po.AuthUser;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author byteblogs
 * @since 2019-08-28
 */
public interface AuthUserDao extends BaseDao<AuthUser> {

    String selectAvatar();
    AuthUser selectAdmin();

}
