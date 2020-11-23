package cn.sinven.springbootasync.service;/*
 @author lj

 @create 2020-10-21 16:20
 
 @email 1624058512@qq.com 

 */

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {

    @Scheduled(cron = "0 * * * * 1-7")
    public void scheduled(){
        System.out.println("---------定时任务开启--------");
    }
}
