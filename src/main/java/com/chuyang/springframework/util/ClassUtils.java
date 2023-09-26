package com.chuyang.springframework.util;

/**
 * @author ChuYang
 * @version 1.0
 */
public class ClassUtils {
    public static ClassLoader getDefaultClassLoader() {
        ClassLoader classLoader = null;
        try {
            classLoader = Thread.currentThread().getContextClassLoader();
        } catch (Throwable ex) {
            ex.getCause();
        }
        if (classLoader == null)
            classLoader = ClassUtils.class.getClassLoader();
        return classLoader;
    }
}
