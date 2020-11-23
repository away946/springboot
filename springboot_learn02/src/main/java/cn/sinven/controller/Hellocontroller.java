package cn.sinven.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lj
 * @create 2020-09-10 16:04
 * @email 1624058512@qq.com
 */
@RestController
public class Hellocontroller {
    @RequestMapping("/hello")
    public String hello() {
        return "hello  spring boot!!!!!!";
    }
}
