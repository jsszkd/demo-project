package com.gtja.demoproject.mapper;

import com.gtja.demoproject.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class VideoMapper {

    private static Map<Integer, Video> videoMap = new HashMap<>();

    static {
        videoMap.put(1,new Video("001","数据服务工具视频"));
        videoMap.put(2,new Video("002","DPLINK视频"));
        videoMap.put(3,new Video("003","数据学堂视频"));
        videoMap.put(4,new Video("004","管理驾驶舱视频"));
        videoMap.put(5,new Video("005","你问我答视频"));
    }

    public List<Video> listVideo(){
        List<Video> list = new ArrayList<>();
        list.addAll(videoMap.values());
        return list;
    }


}
