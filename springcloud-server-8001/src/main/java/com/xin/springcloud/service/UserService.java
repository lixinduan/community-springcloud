package com.xin.springcloud.service;

import com.xin.springcloud.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public User selectById(int id);

    public User selectByName(String username);

    public User selectByEmail(String email);

    public int insertUser(User user);

    public int updateStatus(int id, int status);

    public int updateHeader(int id, String headerUrl);

    public int updatePassword(int id, String password);
}
