package com.zplus.terablog.system.init.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.sql.Statement;


@Service
@Slf4j
public class TeraBlogAuthUserTable implements TableInfoService, InitializingBean {

    private static String createTeraBlogAuthUser() {
        return "CREATE TABLE `terablog_auth_user` (\n" +
                "  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',\n" +
                "  `social_id` varchar(255) DEFAULT NULL COMMENT '社交账户ID',\n" +
                "  `username` varchar(64) NOT NULL COMMENT '用户名',\n" +
                "  `password` varchar(255) NOT NULL COMMENT '密码',\n" +
                "  `nickname` varchar(255) DEFAULT NULL COMMENT '别名',\n" +
                "  `role_id` bigint(20) NOT NULL COMMENT '角色主键 1 普通用户 2 admin',\n" +
                "  `email` varchar(128) DEFAULT NULL COMMENT '邮箱',\n" +
                "  `introduction` varchar(255) DEFAULT NULL COMMENT '个人简介',\n" +
                "  `avatar` varchar(255) DEFAULT NULL COMMENT '头像',\n" +
                "  `create_time` datetime NOT NULL COMMENT '注册时间',\n" +
                "  `access_key` varchar(255) DEFAULT NULL COMMENT 'ak',\n" +
                "  `secret_key` varchar(255) DEFAULT NULL COMMENT 'sk',\n" +
                "  `status` int(1) DEFAULT '0' COMMENT '0 正常 1 锁定 ',\n" +
                "  PRIMARY KEY (`id`) USING BTREE,\n" +
                "  UNIQUE KEY `idx_username` (`username`) USING BTREE COMMENT '用户名唯一'\n" +
                ") ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;";
    }

    @Override
    public void builderTable(Statement stat) {
        try {
            stat.execute(createTeraBlogAuthUser());
            log.info("初始化terablog_auth_user完成");
        } catch (SQLException e) {
            log.error("初始化terablog_auth_user失败", e);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        TableInitFactory.register("terablog_auth_user", this);
    }
}
