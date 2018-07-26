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
        // 牙膏  洗面奶 数据线 洗衣液
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        //Person person = (Person)annotationConfigApplicationContext.getBean("person"); 因为bean 使用了@Bean("personName")  所以这个默认的就不能使用了
        Person person = (Person)annotationConfigApplicationContext.getBean("personName");
        System.out.println(person.toString());
        System.out.println("=======");
        Person person1 = (Person)annotationConfigApplicationContext.getBean(Person.class);
        System.out.println(person1.toString());
        System.out.println("=======");
        String personStr[] = annotationConfigApplicationContext.getBeanNamesForType(Person.class);
        for(String str : personStr){
            System.out.println(str);
        }
        System.out.println("=======");
    }

    /**
     * 合并代码。。。。。。。。。。。。。。。。。。。。。。。。。
     * 。。。。。。。。。。。。。。。。。。。。。
     * 。。。。。。。。。。。。。。。。。。。。。。。。。
     * 。。。。。。。。。。。
     */

}
