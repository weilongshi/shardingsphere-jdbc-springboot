package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.demo.repository")
public class ShardingsphereJdbcSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingsphereJdbcSpringbootApplication.class, args);
    }

}
