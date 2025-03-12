package com.zplus.terablog.blog.posts.factory;

import com.zplus.terablog.common.validator.annotion.NotNull;
import com.zplus.terablog.blog.posts.service.BlogPlatformService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 博客搬家工厂
 */
public class BlogPlatformFactory {

    private static final Map<String, BlogPlatformService> blogPlatformServiceMap = new ConcurrentHashMap<>();

    /**
     * 获取工厂BlogPlatformService
     *
     * @return
     */
    public static BlogPlatformService getUploadFileService(String blogType) {
        return blogPlatformServiceMap.get(blogType);
    }

    /**
     * 工厂注册
     *
     * @param blogType
     * @param blogPlatformService
     */
    public static void register(@NotNull final String blogType, final BlogPlatformService blogPlatformService) {
        blogPlatformServiceMap.put(blogType, blogPlatformService);
    }

}
