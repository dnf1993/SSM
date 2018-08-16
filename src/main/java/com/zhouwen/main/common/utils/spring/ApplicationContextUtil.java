package com.zhouwen.main.common.utils.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
public class ApplicationContextUtil implements ApplicationContextAware {
	
	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ApplicationContextUtil.applicationContext = applicationContext;
	}
	
	public static Object getBean(String name){
		assertApplicationContext();
		return applicationContext.getBean(name);
	}
	
	public static <T> T getBean(Class<T> clz) {
		assertApplicationContext();
		return applicationContext.getBean(clz);
	}
	
	public static void assertApplicationContext() {
		if(ApplicationContextUtil.applicationContext == null) {
			throw new RuntimeException("pplicationContext属性为null，请检查是否注入了SpringContextHolder!");
		}
	}

}
