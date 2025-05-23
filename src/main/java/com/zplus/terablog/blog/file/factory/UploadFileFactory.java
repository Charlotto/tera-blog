package com.zplus.terablog.blog.file.factory;

import com.zplus.terablog.common.cache.ConfigCache;
import com.zplus.terablog.common.constant.Constants;
import com.zplus.terablog.common.validator.annotion.NotNull;
import com.zplus.terablog.blog.file.service.UploadFileTemplateService;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 文件存储实例工厂
 * factory mathod pattern
 */
public class UploadFileFactory {

    private static final Map<String, UploadFileTemplateService> uploadFileServiceMap = new ConcurrentHashMap<>();

    /**
     * 获取工厂UploadFileTemplateService
     * Prototype pattern
     * @return
     */
    public static UploadFileTemplateService getUploadFileService() {
        return uploadFileServiceMap.get(ConfigCache.getConfig(Constants.STORE_TYPE));
    }

    /**
     * 工厂注册
     * register function
     * @param storyType
     * @param uploadFileTemplateService
     */
    public static void register(@NotNull final String storyType, final UploadFileTemplateService uploadFileTemplateService) {
        uploadFileServiceMap.put(storyType, uploadFileTemplateService);
    }

}
