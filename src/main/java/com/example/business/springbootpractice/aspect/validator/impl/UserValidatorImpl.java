package com.example.business.springbootpractice.aspect.validator.impl;

import com.example.business.springbootpractice.aspect.validator.itf.UserValidator;
import com.example.business.springbootpractice.pojo.user.User;
import org.springframework.stereotype.Component;

@Component
public class UserValidatorImpl implements UserValidator {
    @Override
    public boolean validate(User user) {
        System.out.println("UserValidatorImpl --- validate");
        return user != null;
    }
}
