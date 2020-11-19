package com.example.business.springbootpractice.aspect.validator.itf;

import com.example.business.springbootpractice.pojo.user.User;

public interface UserValidator {
    boolean validate(User user);
}
