package com.chuyang.springframework.beans.factory.config;

/**
 * @author ChuYang
 * @version 1.0
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
