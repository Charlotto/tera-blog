package com.zplus.terablog.system.init.strategy;

import com.zplus.terablog.common.validator.annotion.NotNull;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class TableInitFactory {
    private static final Map<String, TableInfoService> tableInfoServiceMap = new ConcurrentHashMap<>();

    public static TableInfoService getByTableName(@NotNull final String tableName) {
        return tableInfoServiceMap.get(tableName);
    }

    public static void register(@NotNull final String tableName, final TableInfoService defaultConvertService) {
        tableInfoServiceMap.put(tableName, defaultConvertService);
    }

}
