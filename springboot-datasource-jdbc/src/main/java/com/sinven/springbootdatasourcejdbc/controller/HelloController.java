package com.sinven.springbootdatasourcejdbc.controller;


import com.sinven.springbootdatasourcejdbc.Mapper.DepartmentMapper;
import com.sinven.springbootdatasourcejdbc.bean.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class HelloController {
//    @Autowired
//    JdbcTemplate jdbcTemplate;
    @Autowired
DepartmentMapper departmentMapper;

    /*
     * 进入到登录页面
     */
    @RequestMapping(value = "/")
    public String index(Model model) {
        return "login";
    }

    /*
    登录时请求的方法
     */
    @PostMapping(value = "/login")
    public String login(String userName, String passWord, Map<String, Object> maps, HttpSession session) {
        if ("admin".equals(userName) && "123456".equals(passWord)) {
            session.setAttribute("user", "admin");
            return "redirect:/main";
        } else {
            maps.put("msg", "用户名或密码错误!");
            return "login";
        }

    }

    @RequestMapping(value = "/main")
    public String doLogin() {
        return "dashboard";
    }

    @ResponseBody
    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDepartId(id);
    }
    @ResponseBody
    @GetMapping("/dept")
    public Department insertDepartment(Department department){
        departmentMapper.insertDepartId(department);
        return department;
    }
    /**
     * 退出登录
     * @param request
     * @return
     */
    @GetMapping("/exit")
    public String exit(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return "redirect:/";
    }
}
