package com.httpdemo.demo99.test;

import com.httpdemo.demo99.anno.HttpRequest;
import com.httpdemo.demo99.anno.HttpUtil;
import com.httpdemo.demo99.anno.Method;

/**
 * @author xiemin
 * @date 2019/9/25 13:57
 */

@HttpUtil(url = "http://127.0.0.1")
public interface RequestDemo {

    @HttpRequest(path = "/index")
    String test1();

    @HttpRequest(path = "/post", method = Method.POST)
    String test2();

}
