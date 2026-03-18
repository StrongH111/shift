package com.iflytek.ioc.service.impl;

import com.iflytek.ioc.dao.UserDao;
import com.iflytek.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDaoImpl2")
    private UserDao userDao;
    private String name;
    public void setName(String name) {
        this.name = name;
    }
}
