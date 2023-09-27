package com.chuyang.springframework.core.io;

/**
 * @author ChuYang
 * @version 1.0
 */
public interface ResourceLoader {
    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
