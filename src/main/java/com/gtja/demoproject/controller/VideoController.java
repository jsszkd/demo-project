package com.gtja.demoproject.controller;

import com.gtja.demoproject.domain.Video;
import com.gtja.demoproject.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("/listVideo" )
    public Object getUserList(){
        List<Video> videoList  = videoService.listVideo();

        return videoList;
    }
}
