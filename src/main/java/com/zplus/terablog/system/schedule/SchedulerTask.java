package com.zplus.terablog.system.schedule;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zplus.terablog.blog.auth.dao.AuthTokenDao;
import com.zplus.terablog.blog.auth.domain.po.AuthToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 *   

 */
@Component
@Slf4j
public class SchedulerTask {

    @Autowired
    private AuthTokenDao authTokenDao;

    @Scheduled(cron = "0 0/1 * * * ?")
    private void scanToken() {
        log.debug(" {} 扫描过期Token", LocalDateTime.now());
        authTokenDao.delete(new LambdaQueryWrapper<AuthToken>().le(AuthToken::getExpireTime, LocalDateTime.now()));
    }
}
