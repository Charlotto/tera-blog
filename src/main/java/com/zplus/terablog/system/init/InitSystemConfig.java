package com.zplus.terablog.system.init;

import com.zplus.terablog.common.cache.ConfigCache;
import com.zplus.terablog.blog.config.dao.ConfigDao;
import com.zplus.terablog.blog.config.domain.po.Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: byteblogs
 * @date: 2019/09/03 12:09
 */
@Slf4j
@Component
@DependsOn({"dataSource"})
public class InitSystemConfig implements ApplicationListener<ApplicationContextEvent>, Ordered {

    @Autowired
    private ConfigDao configDao;

    public void init() {

        List<Config> configList = configDao.selectList(null);
        configList.forEach(config -> {
            log.debug("config_key: {}, config_vlaue: {}", config.getConfigKey(), config.getConfigValue());
            ConfigCache.putConfig(config.getConfigKey(), config.getConfigValue());
        });

    }

    @Override
    public void onApplicationEvent(ApplicationContextEvent applicationContextEvent) {
        init();
    }

    @Override
    public int getOrder() {
        return 1;
    }
}