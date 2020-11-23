package cn.sinven;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootWebLearn3ApplicationTests {

    @Test
    void contextLoads() {
        String sz="13454_12_42";
        String [] sp=sz.split("_");

        System.out.println(sp[0]);
        System.out.println(sp[1]);System.out.println(sp[2]);

    }

}
