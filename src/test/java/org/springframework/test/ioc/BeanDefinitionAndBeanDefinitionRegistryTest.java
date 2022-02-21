package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @Description:
 * @title: BeanDefinitionAndBeanDefinitionRegistryTest
 * @Author Yaozhiwei
 * @Date: 2022/2/22 4:03 下午
 * @Version 1.0
 */
public class BeanDefinitionAndBeanDefinitionRegistryTest {
    @Test
    public void testBeanFactory() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        HelloService bean = (HelloService) beanFactory.getBean("helloService");
        bean.sayHello();
    }
}
