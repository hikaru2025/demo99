package com.httpdemo.demo99.bean;


import com.httpdemo.demo99.anno.HttpRequest;

import java.lang.reflect.Method;

/**
 * @author xiemin
 * @date 2019/9/25 15:55
 */
public class DemoHttpHandler implements HttpHandler {

    String url;

    public DemoHttpHandler(String url) {
        this.url = url;
    }

    @Override
    public String handle(Method method) {
        HttpRequest httpRequest = method.getAnnotation(HttpRequest.class);


        return httpRequest.method() + url;
    }

}
