package com.zplus.terablog.blog.posts.controller;

import com.zplus.terablog.common.annotation.LoginRequired;
import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.blog.posts.domain.vo.BlogMoveVO;
import com.zplus.terablog.blog.posts.service.BlogMoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

/**
 *     
 * @description:

 * @modified:
 */
@RestController
@RequestMapping("/blog-move")
public class BlogMoveController {

    @Autowired
    private BlogMoveService blogMoveService;

    @LoginRequired
    @PostMapping("/v1/file")
    public Result uploadFileList(@RequestParam("file")MultipartFile file){
        return blogMoveService.importDataByFile(file);
    }

    @LoginRequired
    @PostMapping("/v1/mysql")
    public Result importDataByDB(@Valid @RequestBody BlogMoveVO blogMoveVO){
        return blogMoveService.importDataByDB(blogMoveVO);
    }
}
