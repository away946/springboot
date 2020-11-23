package cn.sinven.springbootweb.service.impl;

import cn.sinven.springbootweb.dao.AdminDao;
import cn.sinven.springbootweb.entity.Admin;
import cn.sinven.springbootweb.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceimpl implements AdminService {
    @Autowired
    AdminDao adminDao;
    @Override
    public Admin login(String name, String password) {
        return adminDao.login(name,password);
    }

    @Override
    public int addAdmin(Admin admin) {
        return adminDao.addAdmin(admin);
    }
}
