package com.spring.config;

import com.spring.beans.Person;
import com.spring.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 17:45 2018/4/25
 */
@Configuration  // 告诉spring 这是一个配置类
@ComponentScans(value = {
        @ComponentScan(value = "com.spring",includeFilters={
                @ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Controller.class}),
                @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE,classes = {BookService.class})
        },useDefaultFilters = false)
})

/*ComponentScans
@ComponentScan(value = "com.spring",includeFilters={
        @ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Controller.class, Service.class}),
},useDefaultFilters = false)
 ComponentScan 包扫描 value= 扫描的包
 excludeFilters = Filter[] 扫描的时候排除那些组件
 includeFilters = Filter[] 扫描的时候只那些组件 需要设置useDefaultFilters = false

FilterType.ANNOTATION   按照注解
FilterType. ASSIGNABLE_TYPE 按照给定的类型
FilterType.ASPECTJ
FilterType.REGEX
FilterType.CUSTOM
 */



public class MainConfig {

    @Bean("personName") // 如果没有值，则默认使用方法名。
    public Person person(){
       return new Person(12,"hudiconnation");
    }

}
