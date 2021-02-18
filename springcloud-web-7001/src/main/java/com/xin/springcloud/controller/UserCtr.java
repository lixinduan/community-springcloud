package com.xin.springcloud.controller;

import com.xin.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserCtr {

    @Autowired
    private RestTemplate restTemplate;

    private static final String url="http://SPRINGCLOUD-SERVER";

    @RequestMapping(path ="/find/{id }",method = RequestMethod.GET)

    public User findUser(@PathVariable("id")int id){
        return restTemplate.getForObject(url+"/find/"+id,User.class);
    }

}
