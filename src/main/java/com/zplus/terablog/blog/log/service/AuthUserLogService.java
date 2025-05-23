package com.zplus.terablog.blog.log.service;


import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.common.base.service.BaseService;
import com.zplus.terablog.blog.log.domain.po.AuthUserLog;
import com.zplus.terablog.blog.log.domain.vo.AuthUserLogVO;

/**
 * 用户行为日志记录表:业务接口类
 */
public interface AuthUserLogService extends BaseService<AuthUserLog> {


    Result saveLogs(AuthUserLogVO authUserLogVO);

    /**
     * 查询用户行为日志记录表
     */
    Result<AuthUserLogVO> getLogs(Long id);

    
    /**
     * 分页查询用户行为日志记录表
     */
    Result<AuthUserLogVO> getLogsList(AuthUserLogVO authUserLogVO);

    Result<AuthUserLogVO> deleteLogs(Long id);
}