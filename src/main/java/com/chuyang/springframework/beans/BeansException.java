package com.chuyang.springframework.beans;

/**
 * @author ChuYang
 * @version 1.0
 */
public class BeansException extends RuntimeException {
    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
