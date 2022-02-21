package org.springframework.test.ioc;

/**
 * @Description:
 * @title: HelloService
 * @Author Yaozhiwei
 * @Date: 2022/2/22 4:03 下午
 * @Version 1.0
 */
public class HelloService {

	public String sayHello() {
		System.out.println("hello");
		return "hello";
	}
}
