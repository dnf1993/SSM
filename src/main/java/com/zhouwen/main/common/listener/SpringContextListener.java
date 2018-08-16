package com.zhouwen.main.common.listener;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;
/**
* 描述：Spring容器初始化监听器
* @author create or edit by zhouwen
* @date 2018年8月5日--下午10:40:33
*/
public class SpringContextListener extends ContextLoaderListener  {

	@Override
	public void contextInitialized(ServletContextEvent sce) {

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}


}
