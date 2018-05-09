package com.spring.beans;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 16:29 2018/5/7
 */
public class Car {

    public Car(){
        System.out.println("car constructor..... ");
    }

    public  void init(){
        System.out.println("car .....init......");
    }

    public void destroy(){
        System.out.println("car ....destroy....");
    }

}
