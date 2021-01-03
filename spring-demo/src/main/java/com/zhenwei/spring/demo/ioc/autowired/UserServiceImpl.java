package com.zhenwei.spring.demo.ioc.autowired;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{

  @Override
  public void sing(String something){
    System.out.println("i will sing something :"+something);
  }

  @Override
  public void read(String something) {
    System.out.println("i will read something :"+something);
  }


  public void read(Integer integer) {
    read(" 这是干啥:"+integer);
  }
}
