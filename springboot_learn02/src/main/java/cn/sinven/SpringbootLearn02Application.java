package cn.sinven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ImportResource(locations = "classpath:springConfig.xml")
public class SpringbootLearn02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLearn02Application.class, args);
    }

}
