package com.nhc.batisdemo.controller;

import com.nhc.batisdemo.vo.ResultVo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@SpringBootTest
@RunWith(SpringRunner.class)
public class UserControlerTest {

    @Autowired
    UserControler userControler;

    @Test
    public void createUser() throws Exception {
       ResultVo resultVo =  userControler.createUser(null);
        Assert.assertNotEquals(null,resultVo);
    }

    @Test
    public void getUserList() throws Exception {

        ResultVo resultVo = userControler.getUserList();

        Assert.assertNotEquals(null,resultVo);
    }

}