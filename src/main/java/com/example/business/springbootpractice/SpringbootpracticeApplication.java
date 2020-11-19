package com.example.business.springbootpractice;

import com.example.business.springbootpractice.aspect.HelloAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.example.business.springbootpractice.service.impl",
   "com.example.business.springbootpractice.pojo.user", "com.example.business.springbootpractice.aspect",
   "com.example.business.springbootpractice.controller", "com.example.business.springbootpractice.db"}, exclude = {SecurityAutoConfiguration.class})
public class SpringbootpracticeApplication {

    @Bean(name = "helloAspect")
    public HelloAspect getHelloAspect() {
        return new HelloAspect();
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootpracticeApplication.class, args);
        
    }
}
