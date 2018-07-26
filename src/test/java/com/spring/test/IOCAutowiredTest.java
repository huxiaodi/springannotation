package com.spring.test;

import com.spring.beans.Red;
import com.spring.config.MainConfigOfAutowired;
import com.spring.dao.BookDao;
import com.spring.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 9:23 2018/5/10
 */
public class IOCAutowiredTest {
    private AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

    @Test
    public  void test(){
        sout();
        BookService bookService = annotationConfigApplicationContext.getBean(BookService.class);
        System.out.println(bookService);
        /*BookDao bookDao =annotationConfigApplicationContext.getBean(BookDao.class);
        System.out.println(bookDao);
        System.out.println(bookDao.getInfo());*/

        Map<String, BookDao>  beansOfType = annotationConfigApplicationContext.getBeansOfType(BookDao.class);
        System.out.println(beansOfType);



    }

    @Test
    public void sout(){
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for(String str : beanDefinitionNames){
            System.out.println(str);
        }
    }

    @Test
    public void aware(){
      /*  System.out.println("装载容器："+annotationConfigApplicationContext);
        Red red = annotationConfigApplicationContext.getBean(Red.class);
        System.out.println(red);*/




        int a =(int)(Math.random()*90000+10000);
        System.out.println(a);
    }

}
