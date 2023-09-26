package com.chuyang.springframework.beans.factory.config;

/**
 * @author ChuYang
 * @version 1.0
 */
@SuppressWarnings({"rawtypes"})
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass){
        this.beanClass = beanClass;
    }
}
