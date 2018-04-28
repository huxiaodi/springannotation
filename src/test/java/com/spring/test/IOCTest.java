package com.spring.test;

import com.spring.config.MainConfig;
import com.spring.config.MainConfig2;
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

    @Test
    public  void test2() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =  new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println("容器创建完成。。。。");
        Object object = annotationConfigApplicationContext.getBean("person");
        Object object2 = annotationConfigApplicationContext.getBean("person");
        System.out.println(object == object2);

    }
}
