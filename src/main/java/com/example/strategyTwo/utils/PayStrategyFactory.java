package com.example.strategyTwo.utils;

import com.example.strategyTwo.annotation.Pay;
import com.example.strategyTwo.service.PayStrategy;
import org.reflections.Reflections;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 支付策略工厂
 *
 * @author xiepanpan
 * @date 2018/11/14
 **/
public class PayStrategyFactory {

    private static final String PAY_STRATEGY_IMPLEMENTATION_PACKAGE = "com.example.strategyTwo.service";
    private static final Map<String, Class> STRATEGY_MAP = new HashMap<>();

    // 获取所有支付策略
    static {
        Reflections reflections = new Reflections(PAY_STRATEGY_IMPLEMENTATION_PACKAGE);
        Set<Class<?>> classSet = reflections.getTypesAnnotatedWith(Pay.class);
        classSet.forEach(aClass -> {
            Pay payAnnotation = aClass.getAnnotation(Pay.class);
            STRATEGY_MAP.put(payAnnotation.value(), aClass);
        });
    }

    /**
     * 根据支付策略类型获取支付策略bean
     *
     * @param type
     * @return
     */
    public static PayStrategy getStrategy(String type) {
        // 反射获取支付策略实现类clazz
        Class clazz = STRATEGY_MAP.get(type);
        if (StringUtils.isEmpty(clazz)) {
            return null;
        }

        // 通过applicationContext获取bean
        return (PayStrategy) BeansUtil.getBean(clazz);
    }
}