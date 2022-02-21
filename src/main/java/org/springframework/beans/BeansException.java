package org.springframework.beans;

/**
 * @Description:
 * @title: BeansException
 * @Author Yaozhiwei
 * @Date: 2022/2/22 3:35 下午
 * @Version 1.0
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}