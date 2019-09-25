package com.httpdemo.demo99;

import com.httpdemo.demo99.anno.EnableHttpUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableHttpUtil
public class Demo99Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo99Application.class, args);
    }

}
