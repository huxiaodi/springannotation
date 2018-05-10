package com.spring.config;

import com.spring.dao.BookDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 9:04 2018/5/10
 */
@ComponentScan({"com.spring.controller","com.spring.service","com.spring.dao"})
public class MainConfigOfAutowired {

    @Bean("bookDao2")
    private BookDao bookDao(){
        return new BookDao("2");
    }
}
