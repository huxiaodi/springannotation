package com.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 16:02 2018/5/9
 */

public class MyBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName+"==Before===="+bean.toString());
        if(bean instanceof Dog){
            System.out.println("============================================");
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName+"===After==="+bean.toString());
        return bean;
    }
}
