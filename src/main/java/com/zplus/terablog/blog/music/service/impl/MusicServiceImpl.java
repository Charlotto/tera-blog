package com.zplus.terablog.blog.music.service.impl;

import com.zplus.terablog.common.base.domain.Result;
import com.zplus.terablog.blog.music.service.MusicService;
import com.zplus.terablog.blog.music.util.MusicUtil;
import org.springframework.stereotype.Service;


@Service
public class MusicServiceImpl implements MusicService {

    @Override
    public Result getPlayList() {
      return Result.createWithModels(MusicUtil.getPlayList());
    }
}
