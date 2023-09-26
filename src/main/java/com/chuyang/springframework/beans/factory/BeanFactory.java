package com.chuyang.springframework.beans.factory;

import com.chuyang.springframework.beans.BeansException;

/**
 * @author ChuYang
 * @version 1.0
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;
    Object getBean(String name, Object... args) throws BeansException;
}
