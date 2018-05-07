package com.spring.Condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 13:25 2018/5/4
 */
public class MYImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.spring.beans.Yellow","com.spring.beans.Blue"};
    }
}
