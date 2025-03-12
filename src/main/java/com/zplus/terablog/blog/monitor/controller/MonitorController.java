package com.zplus.terablog.blog.monitor.controller;

import com.zplus.terablog.common.annotation.LoginRequired;
import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.system.enums.RoleEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zplus.terablog.blog.monitor.util.RuntimeUtil;

@RestController
@RequestMapping("/monitor")
public class MonitorController {

    @GetMapping("/system/v1/get")
    @LoginRequired(role = RoleEnum.ADMIN)
    public Result getSystem() {
        return RuntimeUtil.getProperty();
    }

    @GetMapping("/memory/v1/get")
    @LoginRequired(role = RoleEnum.ADMIN)
    public Result getMemory(){
        return RuntimeUtil.getMemory();
    }
}
