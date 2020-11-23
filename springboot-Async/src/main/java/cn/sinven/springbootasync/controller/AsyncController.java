package cn.sinven.springbootasync.controller;/*
 @author lj

 @create 2020-10-21 16:14
 
 @email 1624058512@qq.com 

 */

import cn.sinven.springbootasync.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
    @Autowired
    AsyncService as;

    @GetMapping("/async")
    public String async(){
        as.async();
        return "success";
    }

}
