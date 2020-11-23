package cn.sinven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@EnableRabbit
@MapperScan(value = "cn.sinven.mapper")
public class SpringCacageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCacageApplication.class, args);
    }

}
