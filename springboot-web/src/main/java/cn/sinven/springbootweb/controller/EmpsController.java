package cn.sinven.springbootweb.controller;


import cn.sinven.springbootweb.dao.DepartmentDao;
import cn.sinven.springbootweb.dao.EmployeeDao;
import cn.sinven.springbootweb.entity.Department;
import cn.sinven.springbootweb.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmpsController {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;
    /**
     * 查看所有员工信息
     * @param model
     * @return
     */
    @GetMapping("/emps")
    public String getEmpsAll(Model model){
       Collection<Department> departments = departmentDao.findAll();
       model.addAttribute("deps",departments);
        Collection<Employee> emps= employeeDao.findEmpAll();
        model.addAttribute("emps",emps);
        return "list";
    }

    /**
     * 去员工添加页面
     * @param model
     * @return
     */
    @GetMapping("/emp")
    public String addEmpPage(Model model){
        Collection<Department> departments=departmentDao.findAll();
        model.addAttribute("deps",departments);
        return "add";
    }

    /**
     * 添加功能的实现
     * @param employee
     * @return
     */
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        System.out.println(employee);
        employeeDao.insertEmp(employee);
        return "redirect:/emps";
    }

    /**
     * 修改添加页面二合一
     * 来到添加页面
     * @param model
     * @return
     */
    @GetMapping("/emp/{id}")
    public String addEmpPage1(@PathVariable("id") Integer id,Model model){
        Employee employee=employeeDao.getEmpById(id);
        model.addAttribute("emp",employee);
        Collection<Department> departments=departmentDao.findAll();
        model.addAttribute("deps",departments);
        return "add";
    }
    /**
     * 修改功能的实现
     * @param employee
     * @return
     */
    @PutMapping("/emp")
    public String editEmp(Employee employee){
        System.out.println(employee);
        employeeDao.editEmp(employee);
        return "redirect:/emps";
    }
    @DeleteMapping("/emp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
        employeeDao.delEmp(id);
        return "redirect:/emps";
    }
}
