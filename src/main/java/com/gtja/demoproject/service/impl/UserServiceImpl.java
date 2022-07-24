package com.gtja.demoproject.service.impl;

import com.gtja.demoproject.domain.User;
import com.gtja.demoproject.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> listUser() {
        System.out.println("This is dev");
        return null;
    }
}
