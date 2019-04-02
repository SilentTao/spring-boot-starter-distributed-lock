package com.silent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.silent"})
public class DistributedLockApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistributedLockApplication.class, args);
    }


}
