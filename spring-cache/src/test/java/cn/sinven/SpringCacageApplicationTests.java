package cn.sinven;

import cn.sinven.entity.Employee;
import cn.sinven.mapper.EmployeeMapper;
import cn.sinven.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchRestClientProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class SpringCacageApplicationTests {
    @Autowired
    EmployeeService employeeService;
    @Autowired
     RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    EmployeeMapper em;


    @Test
    void redisTest(){
        //stringRedisTemplate.opsForList().leftPushAll("list","1,23,4,5,6","124");
        //stringRedisTemplate.opsForValue().append("gender","男");
        //stringRedisTemplate.opsForSet().add("set","规范化股份","发鬼地方个","我是你爸爸");
       // stringRedisTemplate.opsForHash().hasKey("hash","12455.6");
       // stringRedisTemplate.opsForZSet().add("zset","第三方的",1200);
        /**
         * 先进后出 后进先出  对应现实中的业务是  微信朋友圈和QQ空间
         */
        //redisTemplate.opsForList().leftPushAll("k--v list","1","2","3","我爱你，蠢货","蠢货是谁");
        //System.out.println(redisTemplate.opsForList().range("k--v list",0,-1));
        //em.finEmpById(2);
        redisTemplate.opsForList().leftPush("emp:01",em.finEmpById(1));
        System.out.println(redisTemplate.opsForList().range("emp:01",0,-1));
    }

    @Test
    void contextLoads() {
        Employee employee = employeeService.finEmpById(1);
        System.out.println(employee);
    }

    @Autowired
    RabbitTemplate rabbitTemplate;
    @Autowired
    AmqpAdmin amqpAdmin;
    @Test
    void arbbitMqTest(){
        //网消息队列里加东西
        //rabbitTemplate.convertAndSend("sinven.topic","sinven.topic","你好朋友有");
        Employee employee=new Employee(2,"大度","153@qq.com",0,1);
        Map<String,Object> maps=new HashMap<String, Object>();
        maps.put("emp",employee);
        maps.put("String","再见");
        rabbitTemplate.convertAndSend("amqp.topic","sinven.topic",maps);
//        从消息队列里面获取数据
//        Object o=rabbitTemplate.receiveAndConvert("amqp.queues");
//        System.out.println(o.getClass());
//        System.out.println(o);
    }
    @Test
    void amqpAdmintest(){
        //首先创建一个交换机
//        amqpAdmin.declareExchange(new TopicExchange("amqp.topic"));
//        //再创建一个队列
//        amqpAdmin.declareQueue(new Queue("amqp.topic"));
//        //最后再绑定一个规则
        amqpAdmin.declareBinding(new Binding("sinven.#", Binding.DestinationType.QUEUE,"amqp.topic","sinven.#",null));
        //删除交换机
        //amqpAdmin.deleteExchange("amqp.direct");
    }
    @Autowired
    ElasticsearchRestClientProperties elasticsearchRestClientProperties;

}
