package com.example.business.springbootpractice.service.impl;

import com.example.business.springbootpractice.pojo.user.User;
import com.example.business.springbootpractice.service.itf.HelloUser;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserService implements HelloUser {
    @Override
    public void printHello(User user) {
        System.out.println("hello user " + user.getUserName() + " " + user.getPassword());
    }
}
