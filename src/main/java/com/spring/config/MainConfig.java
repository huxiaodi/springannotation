package com.spring.config;

import com.spring.beans.Person;
import org.springframework.context.annotation.Bean;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 17:45 2018/4/25
 */
public class MainConfig {

    @Bean
    public Person person(){
       return new Person(12,"hudiconnation");
    }

}
