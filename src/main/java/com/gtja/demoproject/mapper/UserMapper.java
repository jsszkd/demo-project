package com.gtja.demoproject.mapper;

import com.gtja.demoproject.domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserMapper {

    private static Map<Integer, User> userMap = new HashMap<>();

    static {
        userMap.put(1,new User("018700","jiangshanshan","123"));
        userMap.put(2,new User("019700","zhangsan","123456"));
        userMap.put(3,new User("020700","lisi","123456789"));


    }
}
