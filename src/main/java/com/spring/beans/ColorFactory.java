package com.spring.beans;

import com.spring.beans.Color;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 13:59 2018/5/7
 */
public class ColorFactory implements FactoryBean<Color> {
    public Color getObject() throws Exception {

        System.out.println("ColorFactoryBean..........创建");
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
