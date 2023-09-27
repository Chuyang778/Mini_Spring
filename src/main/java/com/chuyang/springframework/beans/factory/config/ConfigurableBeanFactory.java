package com.chuyang.springframework.beans.factory.config;

import com.chuyang.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @author ChuYang
 * @version 1.0
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
