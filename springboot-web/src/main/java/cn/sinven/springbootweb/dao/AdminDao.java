package cn.sinven.springbootweb.dao;

import cn.sinven.springbootweb.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface AdminDao {
    //登录
    public Admin login(@Param("name") String username, @Param("password")String password);
    //注册
    int addAdmin(Admin admin);
}
