package com.gtja.demoproject.service.impl;

import com.gtja.demoproject.domain.Video;
import com.gtja.demoproject.mapper.VideoMapper;
import com.gtja.demoproject.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> listVideo() {
        return videoMapper.listVideo();
    }
}
