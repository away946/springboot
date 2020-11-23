package com.sinven.springbootdatasourcejdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.sinven.springbootdatasourcejdbc.Mapper")
@SpringBootApplication
public class SpringbootDatasourceJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDatasourceJdbcApplication.class, args);
    }

}
