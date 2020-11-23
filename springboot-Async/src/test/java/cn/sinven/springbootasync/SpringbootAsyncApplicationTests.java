package cn.sinven.springbootasync;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
class SpringbootAsyncApplicationTests {
    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    void contextLoads() {

    }
    @Test
    @Scheduled(cron = "0 * * * * 1-7")
    void mailTest() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("账号异常");
        simpleMailMessage.setText("你的邮箱被我用了测试了  ouo  赶紧修改密码吧");
        simpleMailMessage.setTo("1757919323@qq.com");
        simpleMailMessage.setFrom("1624058512@qq.com");
        javaMailSender.send(simpleMailMessage);
    }

}
