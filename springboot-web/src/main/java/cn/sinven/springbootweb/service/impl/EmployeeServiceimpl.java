package cn.sinven.springbootweb.service.impl;

import cn.sinven.springbootweb.dao.EmployeeDao;
import cn.sinven.springbootweb.entity.Employee;
import cn.sinven.springbootweb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceimpl implements EmployeeService {
    @Autowired
    EmployeeDao employeeDao;
    @Override
    public Employee getEmpById(Integer id) {
        return employeeDao.getEmpById(id);
    }

    @Override
    public List<Employee> findEmpAll() {
        return employeeDao.findEmpAll();
    }

    @Override
    public int insertEmp(Employee employee) {
        return employeeDao.insertEmp(employee);
    }

    @Override
    public int editEmp(Employee employee) {
        return employeeDao.editEmp(employee);
    }

    @Override
    public int delEmp(Integer id) {
        return employeeDao.delEmp(id);
    }
}
