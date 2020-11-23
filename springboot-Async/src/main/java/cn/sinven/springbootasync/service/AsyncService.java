package cn.sinven.springbootasync.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/*

 @author lj

 @create 2020-10-21 16:09
 
 @email 1624058512@qq.com 

 */
@Service
public class AsyncService {

    @Async
    public void async(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("async 异步任务");
    }
}
