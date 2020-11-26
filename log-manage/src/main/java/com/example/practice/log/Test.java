package com.example.practice.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志测试
 */
public class Test {
    private final static Logger logger = LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {
        logger.info("sdfd");
    }
}
