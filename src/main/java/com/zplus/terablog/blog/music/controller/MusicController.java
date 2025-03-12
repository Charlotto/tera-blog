package com.zplus.terablog.blog.music.controller;

import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.blog.music.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/music")
public class MusicController {
    @Autowired
    private MusicService musicService;

    @GetMapping("/music/v1/list")
    public Result getPlayList(){
        return musicService.getPlayList();
    }

}
