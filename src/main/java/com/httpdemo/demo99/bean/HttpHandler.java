package com.httpdemo.demo99.bean;


import java.lang.reflect.Method;

/**
 * @author xiemin
 * @date 2019/9/25 15:56
 */
public interface HttpHandler {

    public String handle(Method method);
}
