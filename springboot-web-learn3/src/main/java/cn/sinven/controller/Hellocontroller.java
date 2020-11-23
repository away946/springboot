package cn.sinven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;

/**
 * @author lj
 * @create 2020-09-10 16:04
 * @email 1624058512@qq.com
 */
@Controller
public class Hellocontroller {
    @RequestMapping("/index.html")
    public String hello(Map<String,Object> maps) {
        maps.put("mmp","<h3>我的第一个web跳转页面！</h3>");
        maps.put("mmps",new Date());
        return "index";
    }

    @PostMapping("/login")
    public  String login(String userName,String password,Map<String,Object> maps,HttpSession session){
        if ("admin".equals(userName)&&"123456".equals(password)){
            session.setAttribute("user","admin");
            return "redirect:/main";
        }else {
            maps.put("mag", "用户名或者密码错误！");
            return "index";
        }
    }
    @RequestMapping("/main")
    public String dashboard()  {
        return "dashboard";
    }

}
