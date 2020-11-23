package cn.sinven.springbootweb.service;

import cn.sinven.springbootweb.entity.Admin;
import org.springframework.stereotype.Component;

@Component
public interface AdminService {

    public Admin login(String name, String password);
    //注册
    int addAdmin(Admin admin);
}
