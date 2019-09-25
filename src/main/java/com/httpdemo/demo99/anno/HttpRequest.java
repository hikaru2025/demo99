package com.httpdemo.demo99.anno;

import java.lang.annotation.*;

/**
 * @author xiemin
 * @date 2019/9/25 14:18
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HttpRequest {

    String path() default "";

    Method[] method() default {};
}
