package com.spring.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 17:23 2018/4/25
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {


    @Value("#{10+8}")
    private Integer age;
    @Value("张三")
    private String name;
    @Value("${person.nickName}")
    private String nickName;

    public Person(Integer age ,String name){
        this.age = age;
        this.name = name;
    }


}
