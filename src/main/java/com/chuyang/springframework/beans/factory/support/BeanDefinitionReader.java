package com.chuyang.springframework.beans.factory.support;

import com.chuyang.springframework.beans.BeansException;
import com.chuyang.springframework.core.io.Resource;
import com.chuyang.springframework.core.io.ResourceLoader;


/**
 * @author ChuYang
 * @version 1.0
 */
public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();
    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;
    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
