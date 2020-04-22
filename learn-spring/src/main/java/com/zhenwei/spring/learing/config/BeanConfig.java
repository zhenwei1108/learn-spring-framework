package com.zhenwei.spring.learing.config;

import com.zhenwei.spring.learing.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public User user(){
		User user = new User();
		user.setUserName("zhenwei");
		user.setPassword("123");
		return user;
	}


}
