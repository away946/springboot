package com.sinven.springbootdatasourcejdbc.controller;


import com.sinven.springbootdatasourcejdbc.Mapper.DepartmentMapper;
import com.sinven.springbootdatasourcejdbc.Mapper.EmployeeMapper;
import com.sinven.springbootdatasourcejdbc.bean.Department;
import com.sinven.springbootdatasourcejdbc.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

@Controller
public class EmpsController {
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    DepartmentMapper departmentMapper;
    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }

    /**
     * 查看所有员工信息
     * @param model
     * @return
     */
    @GetMapping("/emps")
    public String getEmpsAll(Model model){
        Collection<Department> departments = departmentMapper.getDepartAll();
        model.addAttribute("deps",departments);
        Collection<Employee> emps= employeeMapper.findEmpAll();
        model.addAttribute("emps",emps);
        return "list";
    }


}
