package com.spring.batching;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@SpringBootApplication
public class BatchingApplication {


    public  static Logger logger  = (Logger) LoggerFactory.getLogger(BatchingApplication.class);

    @PostConstruct
    public void init(){
        logger.info("Application Started");
    }

    public static void main(String[] args) {
        logger.info("Application executed");
        SpringApplication.run(BatchingApplication.class, args);
    }

}
