package com.zplus.terablog.system.init.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.sql.Statement;


@Service
@Slf4j
public class TeraBlogPostsTagsTable implements TableInfoService, InitializingBean {

    @Override
    public void builderTable(final Statement stat) {
        try {
            stat.execute(createTeraBlogPostsTags());
            log.info("初始化terablog_posts_tags完成");
        } catch (final SQLException e) {
            log.error("初始化terablog_posts_tags失败", e);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        TableInitFactory.register("terablog_posts_tags", this);
    }

    private static String createTeraBlogPostsTags() {
        return "CREATE TABLE `terablog_posts_tags`  (\n" +
                "  `id` bigint(20) NOT NULL AUTO_INCREMENT,\n" +
                "  `tags_id` bigint(32) NOT NULL COMMENT '名称',\n" +
                "  `posts_id` bigint(20) NOT NULL COMMENT '文章主键',\n" +
                "  `sort` smallint(6) NOT NULL DEFAULT 0 COMMENT '排序',\n" +
                "  `create_time` datetime(0) NOT NULL COMMENT '创建时间',\n" +
                "  `update_time` datetime(0) NOT NULL COMMENT '更新时间',\n" +
                "  PRIMARY KEY (`id`) USING BTREE\n" +
                ") ENGINE = InnoDB AUTO_INCREMENT = 0 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;";
    }
}
