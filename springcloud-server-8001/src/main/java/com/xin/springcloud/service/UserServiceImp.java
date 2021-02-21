package com.xin.springcloud.service;


import com.xin.springcloud.dao.UserMapper;
import com.xin.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp{

    private UserMapper userMapper;

    public User selectById(int id) {
        return userMapper.selectById(id);
    }

    public User selectByName(String username) {
        return userMapper.selectByName(username);
    }

    public User selectByEmail(String email) {
        return userMapper.selectByEmail(email);
    }

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    public int updateStatus(int id, int status) {
        return userMapper.updateStatus(id,status);
    }

    public int updateHeader(int id, String headerUrl) {
        return userMapper.updateHeader(id,headerUrl);
    }

    public int updatePassword(int id, String password) {
        return userMapper.updatePassword(id,password);
    }

}
