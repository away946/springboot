package cn.sinven.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author lj
 * @create 2020-09-16 11:27
 * @email 1624058512@qq.com
 */
@Configuration
public class myConfiguration implements WebMvcConfigurer {
    @Autowired
    MyLocaleResolver myLocaleResolver;
    @Autowired
    LoginHandlerInterceptor loginHandlerInterceptor;

    @Bean
    public LocaleResolver localeResolver(){
        return myLocaleResolver;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginHandlerInterceptor).addPathPatterns("/main","/emps");
//        .excludePathPatterns("/index.html","/login","/asserts/**","/webjars/**")
    }
}
