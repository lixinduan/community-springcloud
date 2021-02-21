package com.xin.springcloud.controller;

import com.netflix.ribbon.proxy.annotation.Http;
import com.xin.springcloud.entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserCtr {

    @Autowired
    private RestTemplate restTemplate;

    private static final String url="http://SPRINGCLOUD-SERVER";

    @RequestMapping(path ="/index",method = RequestMethod.GET)
    public String getIndexPage(){
        return "";
    }

}
