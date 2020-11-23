package cn.sinven.springbootweb.service.impl;

import cn.sinven.springbootweb.dao.DepartmentDao;
import cn.sinven.springbootweb.entity.Department;
import cn.sinven.springbootweb.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartmentServiceimpl implements BaseService<Department> {
    @Autowired
    DepartmentDao departmentDao;
    @Override
    public int add(Department department) {
        return departmentDao.add(department);
    }

    @Override
    public int delete(Integer id) {
        return departmentDao.delete(id);
    }

    @Override
    public int edit(Department department) {
        return departmentDao.edit(department);
    }

    @Override
    public Department findById(Integer id) {
        return departmentDao.findById(id);
    }

    @Override
    public List<Department> findAll() {
        return departmentDao.findAll();
    }

    @Override
    public int cuscount() {
        return 0;
    }

    @Override
    public List<Department> toPage(int skip, int size) {
        return null;
    }
}
