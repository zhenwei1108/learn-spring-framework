package com.zhenwei.spring.demo.ioc.autowired;

public class UserController {

	@MineAutowired
	private UserHandler userHandler;

	public void singMusic(){
		userHandler.doHandler((service)->service.sing("music: 浪里个浪"));
	}

	public void readBook(){
		userHandler.doHandler((service)->service.read("read: 狼里格狼"));
	}


}
