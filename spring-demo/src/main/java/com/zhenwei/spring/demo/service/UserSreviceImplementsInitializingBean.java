package com.zhenwei.spring.demo.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class UserSreviceImplementsInitializingBean implements InitializingBean {


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("③ this is InitializingBean.afterPropertiesSet");
	}
}
