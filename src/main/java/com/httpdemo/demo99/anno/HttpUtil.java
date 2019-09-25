package com.httpdemo.demo99.anno;

import java.lang.annotation.*;

/**
 * @author xiemin
 * @date 2019/9/25 14:13
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HttpUtil {
    String url() default "";
}
