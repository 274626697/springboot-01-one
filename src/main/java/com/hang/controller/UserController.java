package com.hang.controller;

import com.hang.mapper.UserMapper;
import com.hang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        return userMapper.queryUserList();
    }


}
