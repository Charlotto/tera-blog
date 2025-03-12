package com.zplus.terablog.system.sync;

import com.zplus.terablog.blog.log.domain.vo.AuthUserLogVO;
import com.zplus.terablog.blog.log.service.AuthUserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class LogSyncTask {

    @Autowired
    private AuthUserLogService sysLogServiceImpl;

    @Async(value = "asyncExecutor")
    public void addLog(AuthUserLogVO sysLog) {
        this.sysLogServiceImpl.saveLogs(sysLog);
    }
}
