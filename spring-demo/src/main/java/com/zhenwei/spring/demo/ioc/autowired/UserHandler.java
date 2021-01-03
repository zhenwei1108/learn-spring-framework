package com.zhenwei.spring.demo.ioc.autowired;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class UserHandler {

  /**
   *
   * 若接口中有多个方法, 各个实现需要执行不同的方法实现,可以进行这种定义,
   * 由调用方去指定具体执行哪种方法
   *
   * 将具体执行哪种方法传入下层实现,需借助
   * {@link java.util.function.Consumer} 实现
   * 可以借助 @FunctionalInterface 进行自定义实现
   * {@link FunctionalInterface}
   */
  public void doHandler(Consumer<UserService> consumer){
    UserServiceImpl userService = new UserServiceImpl();
    consumer.accept(userService);
    //对 userService::read 的入参为每次遍历的结果
    Stream.of(1).forEach(userService::read);
  }


}
