package com.spring.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 14:29 2018/5/9
 */
@Component
public class Cat {

    public Cat(){
        System.out.println("Cat....constructor..."); //constructor
    }

    @PostConstruct
    public void init(){
        System.out.println("Cat....PostConstruct...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Cat...PreDestroy");
    }
}
