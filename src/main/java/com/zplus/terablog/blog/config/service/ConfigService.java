package com.zplus.terablog.blog.config.service;

import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.common.base.service.BaseService;
import com.zplus.terablog.blog.config.domain.po.Config;
import com.zplus.terablog.blog.config.domain.vo.ConfigVO;

import java.util.List;

/**
 * @author byteblogs
 * @since 2019-08-28
 */
public interface ConfigService extends BaseService<Config> {

    /**
     * 更新配置
     * @param configList
     * @return
     */
    Result updateConfig(List<ConfigVO> configList);

    /**
     * 查询配置
     * @param configVO
     * @return
     */
    Result getConfigList(ConfigVO configVO);

    /**
     * 查询基础配置
     * @return
     */
    Result getConfigBaseList();
}
