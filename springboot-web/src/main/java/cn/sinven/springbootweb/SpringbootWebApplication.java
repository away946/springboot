package cn.sinven.springbootweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.sinven.springbootweb.dao")
@SpringBootApplication
public class SpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApplication.class, args);
    }

}
