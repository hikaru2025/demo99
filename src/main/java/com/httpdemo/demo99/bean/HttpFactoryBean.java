package com.httpdemo.demo99.bean;

import com.httpdemo.demo99.anno.HttpRequest;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiemin
 * @date 2019/9/25 14:05
 */
public class HttpFactoryBean implements FactoryBean<Object>, InitializingBean {

    private Class<?> type;

    private String url;

    /**
     * 核心方法，创建真正的对象
     */
    @Override
    public Object getObject() throws Exception {
        if (!this.url.startsWith("http")) {
            this.url = "http://" + this.url;
        }
        return createProxy(this.url);
    }

    /**
     * 创建代理类，在代理类中执行真正的操作
     */
    private Object createProxy(String url) {
        InvocationHandler invocationHandler = createInvocationHandler(url);
        Object proxy = Proxy.newProxyInstance(HttpRequest.class.getClassLoader(), new Class[] {type}, invocationHandler);
        return proxy;
    }

    private InvocationHandler createInvocationHandler(String url) {
        return new InvocationHandler() {
            private HttpHandler httpHandler = new DemoHttpHandler(url);

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return httpHandler.handle(method);
            }
        };
    }

    public Class<?> getType() {
        return type;
    }

    public void setType(Class<?> type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * getObjectType是核心方法，只有该方法返回的类型和实际类型匹配时，才能在Spring容器中找到对应类的实例
     */
    @Override
    public Class<?> getObjectType() {
        return this.type;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
