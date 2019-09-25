package com.httpdemo.demo99.anno;

import com.httpdemo.demo99.config.HttpRequestRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xiemin
 * @date 2019/9/25 13:58
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(HttpRequestRegistrar.class)
public @interface EnableHttpUtil {
}
