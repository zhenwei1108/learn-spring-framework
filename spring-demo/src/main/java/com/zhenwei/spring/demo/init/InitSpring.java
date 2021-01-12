package com.zhenwei.spring.demo.init;

import com.zhenwei.spring.learing.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitSpring {


	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		new XmlBeanFactory(new ClassPathResource("application.xml"));
		User user = ctx.getBean(User.class);
		System.out.println("-->> "+user);
	}
}
