package com.zplus.terablog.system.init.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.sql.Statement;


@Service
@Slf4j
public class TeraBlogMenuTable implements TableInfoService, InitializingBean {

    @Override
    public void builderTable(final Statement stat) {
        try {
            stat.execute(createTeraBlogMenu());
            log.info("初始化terablog_menu完成");
        } catch (final SQLException e) {
            log.error("初始化terablog_menu失败", e);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        TableInitFactory.register("terablog_menu", this);
    }

    private static String createTeraBlogMenu() {
        return "CREATE TABLE `terablog_menu` (\n" +
                "  `id` bigint(20) NOT NULL AUTO_INCREMENT,\n" +
                "  `parent_id` bigint(20) DEFAULT '0' COMMENT '父菜单Id',\n" +
                "  `title` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',\n" +
                "  `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'icon图标',\n" +
                "  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '跳转路径',\n" +
                "  `sort` smallint(6) NOT NULL DEFAULT '0' COMMENT '排序',\n" +
                "  PRIMARY KEY (`id`) USING BTREE\n" +
                ") ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='菜单表';";
    }
}
