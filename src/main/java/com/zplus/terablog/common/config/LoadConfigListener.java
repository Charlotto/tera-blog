package com.zplus.terablog.common.config;

import com.zplus.terablog.common.cache.ConfigCache;
import com.zplus.terablog.common.context.BeanTool;
import com.zplus.terablog.blog.config.dao.ConfigDao;
import com.zplus.terablog.blog.config.domain.po.Config;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
//@Component
//@DependsOn({"dataSource"})
public class LoadConfigListener {

    //    @PostConstruct
    public void init() {
        final ConfigDao configDao = BeanTool.getBean(ConfigDao.class);
        final List<Config> configList = configDao.selectList(null);
        configList.forEach(config -> {
            log.debug("config_key: {}, config_vlaue: {}", config.getConfigKey(), config.getConfigValue());
            ConfigCache.putConfig(config.getConfigKey(), config.getConfigValue());
        });
    }

}
