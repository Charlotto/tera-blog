package com.zplus.terablog.system.init.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.sql.SQLException;
import java.sql.Statement;


@Service
@Slf4j
public class TeraBlogAuthTokenTable implements TableInfoService {

    @Override
    public void builderTable(final Statement stat) {
        try {
            stat.execute(createTeraBlogAuthToken());
            log.info("初始化terablog_auth_token完成");
        } catch (final SQLException e) {
            log.error("初始化terablog_auth_token失败", e);
        }
    }

    @PostConstruct
    public void beforePropertiesSet() {
        TableInitFactory.register("terablog_auth_token", this);
    }

    private static String createTeraBlogAuthToken() {
        return "CREATE TABLE `terablog_auth_token`  (\n" +
                "  `id` bigint(20) NOT NULL AUTO_INCREMENT,\n" +
                "  `token` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'token',\n" +
                "  `expire_time` datetime(0) NOT NULL COMMENT '过期时间',\n" +
                "  `user_id` bigint(20) NOT NULL COMMENT '创建人',\n" +
                "  PRIMARY KEY (`id`) USING BTREE\n" +
                ") ENGINE = InnoDB AUTO_INCREMENT = 0 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '标签表' ROW_FORMAT = Compact;";
    }
}
