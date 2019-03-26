package com.nhc.batisdemo.controller;


import com.nhc.batisdemo.compentent.Student;
import com.nhc.batisdemo.model.User;
import com.nhc.batisdemo.service.UserService;
import com.nhc.batisdemo.vo.ResultVo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/user")
@RestController
public class UserControler {

    @Autowired
    UserService userService;


    @Autowired
    Student student;


    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @GetMapping("/create" )
    public ResultVo createUser(User user){
        if(user==null){
            user = new User();
            user.setPhone("default");
            user.setUserName("default");
            user.setPassword("default");
        }
        userService.addUser(user);
        ResultVo<Map<String ,String >> resultVo = new ResultVo();
        Map<String,String> msg = new HashMap<>();
        resultVo.setData(msg);
        return resultVo;
    }
    @GetMapping("/list")
    public ResultVo<List<User>> getUserList(){
        List<User> userList = userService.findAllUser();
        ResultVo resultVo = new ResultVo();
        resultVo.setData(userList);
        return resultVo;
    }

    @GetMapping("/student")
    public ResultVo<Student> getStudent(){

        ResultVo resultVo = new ResultVo();
        resultVo.setData(student);
        return resultVo;

    }

}
