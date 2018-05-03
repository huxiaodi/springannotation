package com.spring.Condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 16:55 2018/5/3
 */
public class LinuxCondition implements Condition {



    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();

        String property = environment.getProperty("os.name");
        System.out.println("===LinuxCondition:"+property);
        if(property.contains("Linux")){
            return true;
        }
        return false;
    }
}
