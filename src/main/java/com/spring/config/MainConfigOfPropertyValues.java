package com.spring.config;

import com.spring.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 17:00 2018/5/9
 */
@Configuration
@PropertySource(value ={"classpath:/person.properties"})
public class MainConfigOfPropertyValues {

    @Bean
    public Person person(){
        return new Person();
    }
}

