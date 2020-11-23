package com.sinven.springbootdatasourcejdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 开启Druid监控功能，需要在application.yml文件中以spring.datasource开头的信息配置相关信息.
 *
 * @author lj
 */
@Configuration
public class DruidConfig
{
    //将设置参数的druid的数据源注册到IOC容器中
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid() {
        return new DruidDataSource();
    }

    //1.配置管理后台的Servlet
    @Bean
    public ServletRegistrationBean<StatViewServlet> statViewServlet()
    {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");

        servletRegistrationBean.addInitParameter("loginUsername", "admin");//登录后台时的用户名
        servletRegistrationBean.addInitParameter("loginPassword", "123456");//登录后台时的密码
        servletRegistrationBean.addInitParameter("allow","127.0.0.1");//默认就是允许所有的访问
        servletRegistrationBean.addInitParameter("deny","");//拒绝

        return servletRegistrationBean;
    }

    //2.配置一个web监控的过滤器
    @Bean
    public FilterRegistrationBean webStatFilter()
    {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());

        //添加过滤规则
        filterRegistrationBean.addUrlPatterns("/*");

        //添加过滤白名单，不拦截的请求
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");

        return filterRegistrationBean;
    }
}