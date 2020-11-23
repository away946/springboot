package cn.sinven.springbootweb.controller;

import cn.sinven.springbootweb.dao.AdminDao;
import cn.sinven.springbootweb.entity.Admin;
import cn.sinven.springbootweb.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;
    @Autowired
    AdminDao adminDao;
    @PostMapping("/login")
    public String login(HttpServletRequest request, Admin admin, Map<String, Object> maps, HttpSession session){
        String username=request.getParameter("name");
        String pwd=request.getParameter("password");
        admin=adminService.login(username,pwd) ;
        if(admin!=null){
            session.setAttribute("user", "admin");
            return "redirect:/main";
        }
        maps.put("msg", "用户名或密码错误!");
        return "login";
    }
    @PostMapping("/register")
    public boolean regAdmin(Admin admin){
        int i=adminDao.addAdmin(admin);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }

    @RequestMapping(value = "/main")
    public String doLogin() {
        return "dashboard";
    }
}
