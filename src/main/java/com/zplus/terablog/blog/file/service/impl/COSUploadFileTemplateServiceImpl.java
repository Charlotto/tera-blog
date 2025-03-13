package com.zplus.terablog.blog.file.service.impl;

import com.zplus.terablog.common.cache.ConfigCache;
import com.zplus.terablog.common.constant.Constants;
import com.zplus.terablog.common.util.FileUtil;
import com.zplus.terablog.blog.file.factory.UploadFileFactory;
import com.zplus.terablog.blog.file.service.UploadFileTemplateService;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.region.Region;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class COSUploadFileTemplateServiceImpl implements UploadFileTemplateService, InitializingBean {

    @Override
    public boolean doCheck(final MultipartFile file) {
        return true;
    }

    @Override
    public String doSaveFileStore(final MultipartFile file) {
        /* 主要业务逻辑 */
        return "";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        UploadFileFactory.register(Constants.COS, this);
    }
}
