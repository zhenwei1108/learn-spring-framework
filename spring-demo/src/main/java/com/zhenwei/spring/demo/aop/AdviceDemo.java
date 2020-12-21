package com.zhenwei.spring.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * 通知
 * @see org.aopalliance.aop.Advice
 *
 *  {@link org.springframework.aop.AfterReturningAdvice}	后置
 *  {@link org.springframework.aop.MethodBeforeAdvice} 	前置
 *  {@link MethodInterceptor}  环绕
 *  {@link org.springframework.aop.ThrowsAdvice}  异常
 *
 *
 */
@Slf4j
public class AdviceDemo implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Method method = invocation.getMethod();
		log.info("{}法执行前~", method.getName());
		//执行方法
		Object proceed = invocation.proceed();
		log.info("{}方法执行后~", method.getName());
		return proceed;
	}
}
