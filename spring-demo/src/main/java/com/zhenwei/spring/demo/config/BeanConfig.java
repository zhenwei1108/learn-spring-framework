package com.zhenwei.spring.demo.config;

import com.zhenwei.spring.demo.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public User user(){
		User user = new User();
		user.setUsername("zhenwei");
		user.setPasswd("123");
		return user;
	}


}
