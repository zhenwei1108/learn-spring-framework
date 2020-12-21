package com.zhenwei.spring.demo.aop;

import lombok.extern.slf4j.Slf4j;

/**
 * target  目标
 */
@Slf4j
public class TargetDemo {

	public void test(){
		log.info("来切我呀~~");
	}

	public void another(){
		log.info("别搞我~~");
	}


}
