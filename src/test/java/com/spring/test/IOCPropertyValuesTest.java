package com.spring.test;

import com.spring.beans.Person;
import com.spring.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 17:02 2018/5/9
 */
public class IOCPropertyValuesTest {
    private AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);

    @Test
    public  void test(){
        sout();
        Person person = (Person) annotationConfigApplicationContext.getBean("person");
        ConfigurableEnvironment environment = annotationConfigApplicationContext.getEnvironment();
        String propertySources = environment.getProperty("person.nickName");
        System.out.println(propertySources);
        System.out.println(person);
        annotationConfigApplicationContext.close();

    }

    public void sout(){
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for(String str : beanDefinitionNames){
            System.out.println(str);
        }
    }
}
