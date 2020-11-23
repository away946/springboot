package com.sinven.springbootdatasourcejdbc.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * 自定义mybatis配置规则 给容器中添加Configuration
 */
@org.springframework.context.annotation.Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
      return   new ConfigurationCustomizer(){
            @Override
            public void customize(Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}

