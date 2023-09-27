package com.chuyang.springframework.beans.factory.config;

import com.chuyang.springframework.beans.BeansException;

import java.beans.Beans;

/**
 * @author ChuYang
 * @version 1.0
 */
public interface BeanPostProcessor {

    /**
     * 在 Bean 对象执行初始化方法之前
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在 Bean 对象执行初始化方法之后，执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
