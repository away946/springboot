package cn.sinven;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SpringbootLerarnDay4Slf4jApplicationTests {
    private static final Logger logger = LoggerFactory.getLogger(SpringbootLerarnDay4Slf4jApplicationTests.class);
    @Test
    void contextLoads() {
        logger.trace("-------trace级别------");
        logger.info("-------info级别-------");
        logger.debug("---------debug级别-------");
        logger.warn("------warn级别--------");
        logger.error("---------error级别----------");
    }

}
