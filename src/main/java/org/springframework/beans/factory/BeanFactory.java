package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;


 /**
  *
  * @Author Yaozhiwei
  * @Date: 2022/2/21 9:36 下午
  * @Version 1.0
  */
public class BeanFactory {
	private Map<String, Object> beanMap = new HashMap<>();

	public void registerBean(String name, Object bean) {
		beanMap.put(name, bean);
	}

	public Object getBean(String name) {
		return beanMap.get(name);
	}
}
