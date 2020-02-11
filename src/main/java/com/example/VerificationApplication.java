package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.example"})
public class VerificationApplication extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(VerificationApplication.class, args);
    }
}

