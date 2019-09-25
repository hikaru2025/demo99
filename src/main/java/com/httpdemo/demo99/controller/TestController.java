package com.httpdemo.demo99.controller;

import com.httpdemo.demo99.test.RequestDemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xiemin
 * @date 2019/9/25 17:31
 */
@RestController
public class TestController {

    @Resource
    private RequestDemo requestDemo;

    @GetMapping("/test")
    public String test() {
        return requestDemo.test1();
    }


}
