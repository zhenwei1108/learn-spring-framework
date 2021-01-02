package com.zhenwei.spring.demo.ioc;

public class UserController {

	@MineAutowired
	private UserService userService;


	public void singMusic(){
		userService.sing("music");
	}


}
