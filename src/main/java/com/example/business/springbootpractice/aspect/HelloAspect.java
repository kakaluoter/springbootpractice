package com.example.business.springbootpractice.aspect;

import com.example.business.springbootpractice.aspect.validator.impl.UserValidatorImpl;
import com.example.business.springbootpractice.aspect.validator.itf.UserValidator;
import com.example.business.springbootpractice.pojo.user.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class HelloAspect {
    @DeclareParents(value = "com.example.business.springbootpractice.service.impl.UserService+", defaultImpl = UserValidatorImpl.class)
    public UserValidator userValidator;
    @Pointcut("execution(* com.example.business.springbootpractice.service.impl.UserService.printHello(..))")
    public void printHello(){

    }
    @Before("printHello()")
    public void before() {
        System.out.println("helloAspect --- before");
    }
    @Before("printHello() && args(user)")
    public void beforeParam(JoinPoint joinPoint, User user) {
        Object[] args = joinPoint.getArgs();
        System.out.println(user);
    }
    @Around("printHello()")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        try {
            pj.proceed();

        }
        catch (Exception e) {
            throw e;
        }
        finally {
            System.out.println("helloAspect --- around");
        }
    }
    @After("printHello()")
    public void after() {
        System.out.println("helloAspect --- after");
    }

    @AfterReturning("printHello()")
    public void afterReturning() {
        System.out.println("helloAspect --- afterReturning");
    }
    @AfterThrowing("printHello()")
    public void afterThrowing() {
        System.out.println("helloAspect --- afterThrowing");
    }
}
