package com.spring.test;

import com.spring.beans.Person;
import com.spring.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 17:29 2018/4/25
 */
public class Test1 {

    @Test
    public void test() {
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person)  applicationContext.getBean("person");
        System.out.println(person.toString());
    }

    @Test
    public void test1() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person)annotationConfigApplicationContext.getBean("person");
        System.out.println(person.toString());
    }


}
