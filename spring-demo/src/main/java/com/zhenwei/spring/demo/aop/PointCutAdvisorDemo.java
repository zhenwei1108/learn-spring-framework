package com.zhenwei.spring.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
/**
 * @author zhenwei
 */
@Slf4j
public class PointCutAdvisorDemo extends DefaultPointcutAdvisor {

	public PointCutAdvisorDemo(Pointcut pointcut, Advice advice){
		super(pointcut, advice);
		log.info("我就是造了个切面~");
	}

	@Override
	public void setPointcut(Pointcut pointcut) {
		super.setPointcut(pointcut);
		AspectJExpressionPointcut expressionPointcut = new AspectJExpressionPointcut();
		expressionPointcut.setExpression("execution (* com.zhenwei.spring.demo.*)");
	}
}
