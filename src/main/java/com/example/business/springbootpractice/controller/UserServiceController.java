package com.example.business.springbootpractice.controller;

import com.example.business.springbootpractice.aspect.validator.itf.UserValidator;
import com.example.business.springbootpractice.pojo.user.User;
import com.example.business.springbootpractice.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequestMapping("/user")
@Controller
public class UserServiceController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/printHello", method = RequestMethod.GET)
    public void printHello(String userName, String password) {
        User user = new User();
        user.setPassword(password);
        user.setUserName(userName);
        userService.printHello(user);
    }
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test() {
        User user = new User();
        UserValidator userValidator = (UserValidator) userService;
        if (userValidator.validate(user)) {
            userService.printHello(new User());
        }
    }
}
