package com.nhc.batisdemo.service.impl;


import com.nhc.batisdemo.mapper.UserMapper;
import com.nhc.batisdemo.model.User;
import com.nhc.batisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        return null;
    }
}
