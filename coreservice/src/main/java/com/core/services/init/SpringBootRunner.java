package com.core.services.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.core.services")
public class SpringBootRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRunner.class, args);
    }
}
