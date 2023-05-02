package com.spring.batching;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@SpringBootApplication
@Slf4j
public class BatchingApplication {



    @PostConstruct
    public void init(){
        log.info("application started");
    }

    public static void main(String[] args) {
        log.info("Application executed");
        SpringApplication.run(BatchingApplication.class, args);
    }

}
