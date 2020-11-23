package cn.sinven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * @author lj
 * @create 2020-09-10 16:04
 * @email 1624058512@qq.com
 */
@Controller
public class Hellocontroller {
    @RequestMapping("/hello")
    public String hello(Map<String,Object> maps) {
        maps.put("mmp","<h3>我的第一个web跳转页面！</h3>");
        maps.put("mmps",new Date());
        return "index";
    }
}
