package com.spring.test;

import com.spring.beans.Person;
import com.spring.config.MainConfig;
import com.spring.config.MainConfig2;
import com.spring.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

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

    @Test
    public void test3(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        ConfigurableEnvironment environmen = applicationContext.getEnvironment();
        String property = environmen.getProperty("os.name");
        System.out.println(property);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }

    @Test
    public void test4(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanNamesForType = applicationContext.getBeanDefinitionNames();
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        Object a  = applicationContext.getBean("getColorFactory");
        Object b  = applicationContext.getBean("getColorFactory");
        System.out.println(a.getClass());
        System.out.println( a == b);

        Object c = applicationContext.getBean("&getColorFactory");
        System.out.println(c.getClass());
    }

    /**
     * Bean的生命周期 ====== MainConfigOfLifeCycle
     */
    @Test
    public void test5(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成");
        //annotationConfigApplicationContext.getBean("car");
        // 关闭容器
        annotationConfigApplicationContext.close();


    }


}
