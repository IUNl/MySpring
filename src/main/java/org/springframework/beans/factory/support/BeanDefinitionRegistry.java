package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition注册表接口
 * @title: BeanDefinitionRegistry
 * @Author Yaozhiwei
 * @Date: 2022/2/21 11:39 下午
 * @Version 1.0
 */
public interface BeanDefinitionRegistry {

    /**
     *
     * @Description: 向注册表中注BeanDefinition
     * @Param: [beanName, beanDefinition]
     * @return: void
     * @Author: Yaozhiwei
     * @Date: 2022/2/21 11:59 下午
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
