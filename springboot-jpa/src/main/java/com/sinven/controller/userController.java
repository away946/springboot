package com.sinven.controller;

import com.sinven.config.UserRepository;
import com.sinven.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lj
 * @create 2020-09-28 16:44
 * @email 1624058512@qq.com
 */
@RestController
public class userController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user=userRepository.getOne(id);
        return user;
    }

}
