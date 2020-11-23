package cn.sinven.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lj
 * @create 2020-09-24 11:16
 * @email 1624058512@qq.com
 */
@Controller
public class indexController {
    @RequestMapping("/")
    public String index(){
        return "login";
    }

    @GetMapping("/register")
    public String toregisterPage(){
        return "register";
    }

    @GetMapping("/exit")
    public String exit(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return "redirect:/";
    }
}
