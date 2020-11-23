package cn.sinven.service;
/*
 @author lj

 @create 2020-10-12 17:37
 
 @email 1624058512@qq.com 
 */

import cn.sinven.entity.Employee;


public interface EmployeeService  {
    Employee finEmpById(Integer id);
    Employee editEmp(Employee employee);
    Integer delEmp(Integer id);
    Employee instEmp(Employee employee);
}
