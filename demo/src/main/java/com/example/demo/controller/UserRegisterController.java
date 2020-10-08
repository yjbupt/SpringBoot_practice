package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/register")
public class UserRegisterController {
    private UserService userService;

    @Autowired
    public UserRegisterController(UserService userService){
        this.userService=userService;
    }

    @PostMapping("")
    public Object add(@RequestBody User user){
        if(userService.findByName(user.getUsername())!=null){
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("message","用户名已被使用");
        }
        return userService.add(user);

    }

}
