package com.spring.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 13:55 2018/4/27
 */
public class MyTypeFilter implements TypeFilter{

    //MetadataReader 获取当前正在扫描的类的信息
    //MetadataReaderFactory 可以获取其他任何类的信息
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        // 获取类的注解信息
        AnnotationMetadata annotationMetadata= metadataReader.getAnnotationMetadata();

        // 获取正在扫描类的名称
        String className = annotationMetadata.getClassName();
        System.out.println("======= : "+className);

        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        Resource resourcer = metadataReader.getResource();

        if(className.contains("er")){
           return true;
        }
        return false;
    }
}
