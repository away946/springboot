package cn.sinven.springbootelasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.config.EnableElasticsearchAuditing;

@SpringBootApplication
@EnableElasticsearchAuditing
public class SpringbootElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootElasticsearchApplication.class, args);
    }

}
