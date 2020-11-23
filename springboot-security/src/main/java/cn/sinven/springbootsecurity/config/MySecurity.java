package cn.sinven.springbootsecurity.config;/*

 @author lj

 @create 2020-10-22 16:20
 
 @email 1624058512@qq.com 

 */

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
@EnableWebSecurity
public class MySecurity extends WebSecurityConfigurerAdapter {
    /**
     * Security 登录验证
     * @return
     */
    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("张三")
                .password("123456")
                .roles("VIP1")
                .build();
        UserDetails user1 = User.withDefaultPasswordEncoder()
                .username("李四")
                .password("123456")
                .roles("VIP2")
                .build();
        UserDetails user2 = User.withDefaultPasswordEncoder()
                .username("巴巴")
                .password("666666")
                .roles("VIP3")
                .build();

        return new InMemoryUserDetailsManager(user,user1,user2);
    }

    /**
     * Security 授权方法
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.authorizeRequests().antMatchers("/").permitAll()
               .antMatchers("/level1/**").hasAnyRole("VIP1","VIP2","VIP3")
               .antMatchers("/level2/**").hasAnyRole("VIP2","VIP3")
               .antMatchers("/level3/**").hasAnyRole("VIP3");
       http.formLogin().loginPage("/userlogin").usernameParameter("name").passwordParameter("pwd");
      http.rememberMe().rememberMeCookieName("reame");
       http.logout();

    }

}
