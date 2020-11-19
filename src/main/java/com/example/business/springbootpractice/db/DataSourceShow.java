package com.example.business.springbootpractice.db;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class DataSourceShow implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
