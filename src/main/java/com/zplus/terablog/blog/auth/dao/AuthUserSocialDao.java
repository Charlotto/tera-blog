package com.zplus.terablog.blog.auth.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zplus.terablog.common.base.dao.BaseDao;
import com.zplus.terablog.blog.auth.domain.po.AuthUserSocial;
import com.zplus.terablog.blog.auth.domain.vo.AuthUserSocialVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 用户表社交信息表:数据层
 */
public interface AuthUserSocialDao extends BaseDao<AuthUserSocial> {

    List<AuthUserSocialVO> selectSocialList(@Param("page") Page<AuthUserSocial> page, @Param("condition") AuthUserSocialVO authUserSocialVO);

}
