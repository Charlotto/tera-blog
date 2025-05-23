package com.zplus.terablog.system.init.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.sql.Statement;


@Service
@Slf4j
public class TeraBlogPostsAttributeTable implements TableInfoService, InitializingBean {

    @Override
    public void builderTable(final Statement stat) {
        try {
            stat.execute(createTeraBlogPostsAttribute());
            log.info("初始化terablog_posts_attribute完成");
        } catch (final SQLException e) {
            log.error("初始化terablog_posts_attribute失败", e);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        TableInitFactory.register("terablog_posts_attribute", this);
    }

    private static String createTeraBlogPostsAttribute() {
        return "CREATE TABLE `terablog_posts_attribute`  (\n" +
                "  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',\n" +
                "  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容',\n" +
                "  `posts_id` bigint(20) NOT NULL COMMENT '文章表主键',\n" +
                "  PRIMARY KEY (`id`) USING BTREE\n" +
                ") ENGINE = InnoDB AUTO_INCREMENT = 0 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;";
    }
}
