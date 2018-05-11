package com.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 11:02 2018/5/4
 */
@Component
public class Red  implements ApplicationContextAware ,EmbeddedValueResolverAware ,BeanNameAware {

    private ApplicationContext applicationContext;
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void setBeanName(String s) {
        System.out.println("Red......:"+s);
    }

    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        System.out.println(resolver.resolveStringValue("你好${os.name},我是#{10+90}"));
    }

    @Override
    public String toString() {
        return "Red{" +
                "applicationContext=" + applicationContext +
                '}';
    }
}
