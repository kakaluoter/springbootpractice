package com.example.business.springbootpractice.db.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DbConfig {

    @Autowired
    private BaseDataProperties dataProperties;

    @Bean("datasource")
    public DataSource getDataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUsername(dataProperties.getUsername());
        basicDataSource.setUrl(dataProperties.getUrl());
        basicDataSource.setPassword(dataProperties.getPassword());
        basicDataSource.setDriverClassName(dataProperties.getDrivername());
        return basicDataSource;
    }
}
