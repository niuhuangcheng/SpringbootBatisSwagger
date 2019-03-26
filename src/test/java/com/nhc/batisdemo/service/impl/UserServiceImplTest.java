package com.nhc.batisdemo.service.impl;

import com.nhc.batisdemo.model.User;
import com.nhc.batisdemo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    UserServiceImpl userService;

    @Test
    public void addUser() throws Exception {
        User user = new User();
        user.setUserName("niu");
        user.setPassword("123");
        user.setPhone("123456789");
        int result = userService.addUser(user);
        Assert.assertNotEquals(0,result);
    }

    @Test
    public void findAllUser() throws Exception {
        List<User> userList = userService.findAllUser();
        Assert.assertNotEquals(null,userList);

    }

}