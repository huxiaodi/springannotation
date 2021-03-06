package com.spring.config;

import com.spring.Condition.*;
import com.spring.beans.ColorFactory;
import com.spring.beans.Person;
import com.spring.beans.Red;
import org.springframework.context.annotation.*;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 14:44 2018/4/27
 */
@Configuration
@Import({Red.class, MYImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {

//    Specifies the name of the scope to use for the annotated component/bean.
//     * <p>Defaults to an empty string ({@code ""}) which implies
//     * {@link ConfigurableBeanFactory#SCOPE_SINGLETON SCOPE_SINGLETON}.
//            * @since 4.2
//            * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
//     * @see ConfigurableBeanFactory#SCOPE_SINGLETON
//     * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
//     * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
//    singleton  单例 在创建容器时，就创建了对象
//    prototype 多例 ， 创建容器时并未创建的对象，等对象调用的时候创建才调用
    @Lazy // 懒加载，延时加载，只在单实例下被使用
    @Scope(value = "singleton")
    @Bean("person")
    public Person person(){
        System.out.println("创建对象~");
        return new Person(12,"rubaobao");
    }


    @Conditional({WindowsCondition.class})
    @Bean("比尔")
    public  Person person1(){
        return new Person(60,"比尔");
    }


   @Conditional({LinuxCondition.class})
    @Bean("维纳斯")
    public  Person person2(){
        return new Person(60,"维纳斯");
    }


    /**
     * FctoryBean
     */
    @Bean
    public ColorFactory getColorFactory(){
        return new ColorFactory();
    }





}
