package com.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 15:55 2018/5/9
 */
public class Dog implements InitializingBean ,DisposableBean {

    public Dog(){
        System.out.println("Gog...Constructor...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Dog....InitializingBean...");
    }

    public void destroy() throws Exception {
        System.out.println("Dog...DisposableBean.....");
    }
}
