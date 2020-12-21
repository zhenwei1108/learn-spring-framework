package com.zhenwei.spring.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class MainAopDemo {

	public static void main(String[] args) {
		testMySelfPoint();
		testDefaultPoint();
	}

	/**
	 * 使用自定义PointCut 可以个性化过滤指定方法
	 */
	public static void testMySelfPoint(){
		log.info("this is testMySelfPoint");
		//通知
		AdviceDemo adviceDemo = new AdviceDemo();
		//切点
		StaticPointCutDemo staticPointCutDemo = new StaticPointCutDemo();
		//target
		TargetDemo target = new TargetDemo();
		//切面？
		PointCutAdvisorDemo pointCutAdvisorDemo = new PointCutAdvisorDemo(staticPointCutDemo, adviceDemo);
		//代理
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.addAdvisor(pointCutAdvisorDemo);
		proxyFactory.setTarget(target);
		//这里会调用一次match方法
		TargetDemo proxy = (TargetDemo) proxyFactory.getProxy();
		proxy.test();
		proxy.another();
	}

	/**
	 * {@link org.springframework.aop.TruePointcut}
	 * 所有方法都会匹配
	 */
	public static void testDefaultPoint(){
		log.info("this is testDefaultPoint");
		//通知
		AdviceDemo adviceDemo = new AdviceDemo();
		//target
		TargetDemo target = new TargetDemo();
		/**
		 * 没有切点，默认使用 {@link TruePointcut}
		 */
		//代理,编织
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(target);
		proxyFactory.addAdvice(adviceDemo);

		Advisor[] advisors = proxyFactory.getAdvisors();
		List<Advisor> list = Arrays.stream(advisors).filter((advisor) -> advisor.getAdvice() instanceof AdviceDemo).collect(Collectors.toList());
		log.info("代理中切面数量为：{}",list.size());
		//这里会调用一次match方法
		TargetDemo proxy = (TargetDemo) proxyFactory.getProxy();
		proxy.test();
		proxy.another();


	}


}
