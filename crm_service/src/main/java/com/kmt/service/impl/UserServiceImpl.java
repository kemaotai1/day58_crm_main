package com.kmt.service.impl;

import com.kmt.dao.IUserDao;
import com.kmt.entity.User;
import com.kmt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
