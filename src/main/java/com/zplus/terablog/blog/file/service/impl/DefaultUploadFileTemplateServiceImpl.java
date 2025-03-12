package com.zplus.terablog.blog.file.service.impl;

import com.zplus.terablog.common.cache.ConfigCache;
import com.zplus.terablog.common.constant.Constants;
import com.zplus.terablog.common.constant.ConstantsModels;
import com.zplus.terablog.common.util.FileUtil;
import com.zplus.terablog.blog.file.factory.UploadFileFactory;
import com.zplus.terablog.blog.file.service.UploadFileTemplateService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class DefaultUploadFileTemplateServiceImpl implements UploadFileTemplateService, InitializingBean {

    @Override
    public boolean doCheck(final MultipartFile file) {
        return true;
    }

    @Override
    public String doSaveFileStore(final MultipartFile file) {
        final String filePath = ConstantsModels.getDefaultPath(ConfigCache.getConfig(Constants.DEFAULT_PATH));
        final String fileName = FileUtil.createSingleFileName(file.getOriginalFilename());
        try {
            final File destFile = new File(filePath);
            if (!destFile.exists()) {
                destFile.mkdirs();
            }
            file.transferTo(new File(filePath + fileName));
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return ConfigCache.getConfig(Constants.DEFAULT_IMAGE_DOMAIN)+Constants.FILE_URL+fileName;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UploadFileFactory.register(Constants.DEFAULT_TYPE, this);
    }


}
