package com.zhenwei.spring.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * 切点
 * 进行方法和类的匹配，分静态和动态
 */
@Slf4j
public class StaticPointCutDemo extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		String targetMethodName = "test";
		log.info("切之前，判断方式是否匹配，需要切方法：{}, 当前类的方法为：{}#{}",targetMethodName,targetClass.getName(), method.getName());
		if (method.getName().equals(targetMethodName)){
			log.info("就是你啦！ {}", targetClass.getName());
			return true;
		}
		return false;
	}
}
