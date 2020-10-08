package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper){
        this.userMapper=userMapper;
    }
    public User add(User user) {
        userMapper.add(user);
        return findById(user.getId());
    }

    public User findById(float id) {
        User user = new User();
        user.setId(id);
        return userMapper.findOne(user);
    }

    public User findByName(String name) {
        User param = new User();
        param.setUsername(name);
        return userMapper.findOne(param);
    }
}
