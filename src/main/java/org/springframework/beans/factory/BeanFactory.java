package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @Description:
 * @title: BeanFactory
 * @Author Yaozhiwei
 * @Date: 2022/2/22 3:34 下午
 * @Version 1.0
 */
public interface BeanFactory {

    /**
     * 获取bean
     *
     * @param name
     * @return Object
     * @throws BeansException bean不存在时
     */
    Object getBean(String name) throws BeansException;
}