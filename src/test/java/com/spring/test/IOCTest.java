package com.spring.test;

import com.spring.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 16:37 2018/4/26
 */
public class IOCTest {

    @Test
    public void test (){
         AnnotationConfigApplicationContext annotationConfigApplicationContext =new AnnotationConfigApplicationContext(MainConfig.class);
         String[] strs =  annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String str: strs) {
            System.out.println(str);
        }

    }
}
