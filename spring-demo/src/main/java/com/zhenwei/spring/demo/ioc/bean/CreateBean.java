package com.zhenwei.spring.demo.ioc.bean;

import com.zhenwei.spring.demo.ioc.autowired.MineAutowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CreateBean {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        MineAutowired.class);
    GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("");

  }


}
