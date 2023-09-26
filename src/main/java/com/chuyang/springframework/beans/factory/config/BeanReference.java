package com.chuyang.springframework.beans.factory.config;

/**
 * @author ChuYang
 * @version 1.0
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
