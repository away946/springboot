package cn.sinven.service;/*

 @author lj

 @create 2020-10-20 11:29
 
 @email 1624058512@qq.com 

 */

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class Department {
    @RabbitListener(queues="sinven.#")
    public void receivel(Object o){
        System.out.println("监听消息："+o);
    }
}
