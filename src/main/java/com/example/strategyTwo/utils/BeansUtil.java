package com.example.strategyTwo.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author: xiepanpan
 * @Date: 2019/11/10
 * @Description:  bean工具类
 */
@Component
public class BeansUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BeansUtil.applicationContext = applicationContext;
    }

    /**
     * 获取实例
     *
     * @param clazz
     * @return
     */
    public static Object getBean(Class clazz) {
        return applicationContext.getBean(clazz);
    }
}