package com.spring.batching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
class BatchingApplicationTests {


    public  static Logger logger  = (Logger) LoggerFactory.getLogger(BatchingApplication.class);

    @Test
    void contextLoads() {

        logger.info("test case executing....");
        Assertions.assertEquals(true, true);
    }

}
