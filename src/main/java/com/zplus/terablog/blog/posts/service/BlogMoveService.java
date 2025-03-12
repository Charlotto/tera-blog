package com.zplus.terablog.blog.posts.service;

import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.blog.posts.domain.vo.BlogMoveVO;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: zsg
 * @description:
 * @date: 2020/4/5 17:13
 * @modified:
 */
public interface BlogMoveService {

    /**
     * 通过文件导入数据
     * @param file
     * @return
     */
    Result importDataByFile(MultipartFile file);

    /**
     * 通过数据库导入数据
     * @param blogMoveVO
     * @return
     */
    Result importDataByDB(BlogMoveVO blogMoveVO);
}
