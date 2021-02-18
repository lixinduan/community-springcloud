package com.xin.springcloud.controller;

import com.xin.springcloud.entity.User;
import com.xin.springcloud.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCtr {

    @Autowired
    private UserServiceImp userServiceImp;

    @GetMapping("/find/{id}")
    public User findUserById(@PathVariable("id")int id){
        return userServiceImp.selectById(id);
    }
}
