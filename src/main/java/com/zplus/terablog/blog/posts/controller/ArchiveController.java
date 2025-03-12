package com.zplus.terablog.blog.posts.controller;

import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.blog.posts.domain.vo.PostsVO;
import com.zplus.terablog.blog.posts.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/archive")
public class ArchiveController {

    @Autowired
    private PostsService postsService;

    @GetMapping("/archive/v1/list")
    public Result<PostsVO> getArchiveTotalByDateList(PostsVO postsVO) {
        return postsService.getArchiveTotalByDateList(postsVO);
    }

    @GetMapping("/year/v1/list")
    public Result<PostsVO> getArchiveGroupYearList(PostsVO postsVO) {
        return postsService.getArchiveGroupYearList(postsVO);
    }
}
