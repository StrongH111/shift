package com.iflytek.ioc.dao.impl;

import com.iflytek.ioc.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public int insertUser(){
        System.out.println("insertUser");
    }
}
