package com.zhenwei.spring.learing.init;

import com.zhenwei.spring.learing.beans.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitSpring {


	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
//		new XmlBeanFactory(new ClassPathResource("application.xml"));
		User user = ctx.getBean(User.class);
		System.out.println("-->> "+user);


	}

}
