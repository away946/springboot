package cn.sinven;

import cn.sinven.bean.Peros;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringbootLearn02ApplicationTests {
    @Autowired
    Peros peros;
    @Autowired
    ApplicationContext context;

    @Test
    void contextLoads() {
        System.out.println(peros.toString());
    }

    @Test
    void spring() {
        System.out.println(context.containsBean("springboot"));
    }

}
