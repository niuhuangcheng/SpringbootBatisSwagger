package com.nhc.batisdemo.service;

import com.nhc.batisdemo.model.User;

import java.util.List;

public interface UserService {


    int addUser(User user);

    List<User> findAllUser();

    List<User> findAllUser(int pageNum,int pageSize);
}
