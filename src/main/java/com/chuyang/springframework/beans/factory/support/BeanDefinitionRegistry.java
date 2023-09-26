package com.chuyang.springframework.beans.factory.support;

import com.chuyang.springframework.beans.factory.config.BeanDefinition;

/**
 * @author ChuYang
 * @version 1.0
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
