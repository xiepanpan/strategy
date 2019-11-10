package com.example.strategyTwo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解 标注支付策略
 *
 * @author xiepanpan
 * @date 2018/11/14
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Pay {
    /**
     * 支付类型
     *
     * @return
     */
    String value();
}
