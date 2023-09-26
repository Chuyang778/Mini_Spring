package com.chuyang.springframework.beans.factory.support;

import com.chuyang.springframework.beans.BeansException;
import com.chuyang.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author ChuYang
 * @version 1.0
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
