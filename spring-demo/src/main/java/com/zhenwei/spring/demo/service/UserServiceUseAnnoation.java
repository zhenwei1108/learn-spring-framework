package com.zhenwei.spring.demo.service;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserServiceUseAnnoation {

	@PostConstruct
	public void init(){
		System.out.println("② this is @PostConstruct");
	}



}
