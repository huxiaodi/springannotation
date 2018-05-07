package com.spring.Condition;

import com.spring.beans.RainBow;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 13:27 2018/5/4
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {



    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean aBoolean = registry.containsBeanDefinition("com.spring.beans.Color");
        boolean definition = registry.containsBeanDefinition("com.spring.beans.Red");
        BeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
        if(aBoolean && aBoolean){
            registry.registerBeanDefinition("rainBow",beanDefinition);
        }
    }
}
