package cn.sinven.springbootweb.dao;

import cn.sinven.springbootweb.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeDao {

    public Employee getEmpById(Integer id);
    public List<Employee> findEmpAll();
    public int  insertEmp(Employee employee);
    public int editEmp(Employee employee);
    public int delEmp(Integer id);
}
