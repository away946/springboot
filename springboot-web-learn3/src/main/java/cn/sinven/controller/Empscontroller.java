package cn.sinven.controller;

import cn.sinven.dao.DepartmentDao;
import cn.sinven.dao.EmployeeDao;
import cn.sinven.entities.Department;
import cn.sinven.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Collection;

/**
 * @author lj
 * @create 2020-09-19 16:10
 * @email 1624058512@qq.com
 *
 * 访问所有员工页面 查询所以员工信息
 */
@Controller
public class Empscontroller {
    @Autowired
    EmployeeDao ed;
    @Autowired
    DepartmentDao dd;

    /**
     * 查看所有员工信息
     * @param model
     * @return
     */
    @GetMapping("/emps")
    public String getEmpsAll(Model model){
        Collection<Employee> emps= ed.getAll();
        model.addAttribute("emps",emps);
        return "list";
    }

    /**
     * 点击添加按钮跳转到添加页面把部门回显
     * @param model
     * @return
     */
    @GetMapping ("/addemps")
    public String addEmpPage(Model model){
        Collection<Department> departments = dd.getDepartments();
        model.addAttribute("deps",departments);
        return "addemps";
    }

    /**
     * 添加员工信息
     * @param employee
     * @return
     */
    @PostMapping("/addemps")
    public String addEmp(Employee employee){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(employee.getBirth()));
        ed.save(employee);
        return "redirect:/emps";
    }

    /**
     * 退出登录
     * @param request
     * @return
     */
    @GetMapping("/exit")
    public String exit(HttpServletRequest request){
                 request.getSession().removeAttribute("user");
                 return "redirect:/index.html";
             }

    /**
     * 点击修改按钮跳转到修改页面并回显
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/emps/{id}")
    public String toeditPage(@PathVariable Integer id, Model model){
        Employee emps = ed.get(id);
        model.addAttribute("emps",emps);

        Collection<Department> departments = dd.getDepartments();
        model.addAttribute("deps",departments);
        return "addemps";
    }

    /**
     * 修改存值
     * @param employee
     * @return
     */
    @PutMapping("/addemps")
    public String editEmp(Employee employee){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(employee.getBirth()));
        ed.save(employee);
        return "redirect:/emps";
    }

    /**
     * 获取前台传过来的ID删除该用户
     * @param id
     * @return
     */
    @DeleteMapping("/emps/{id}")
    public String delemp(@PathVariable Integer id){
        ed.delete(id);
        return "redirect:/emps";
    }
}
