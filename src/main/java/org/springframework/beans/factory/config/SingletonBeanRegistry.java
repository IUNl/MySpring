package org.springframework.beans.factory.config;

/**
 * @Description: 单例注册表
 * @title: SingletonBeanRegistry
 * @Author Yaozhiwei
 * @Date: 2022/2/22 12:02 上午
 * @Version 1.0
 */
public interface SingletonBeanRegistry {

    /**
     *
     * @Description:
     * @Param: [beanName]
     * @return: java.lang.Object
     * @Author: Yaozhiwei
     * @Date: 2022/2/22 12:03 上午
     */
    Object getSingleton(String beanName);
}
