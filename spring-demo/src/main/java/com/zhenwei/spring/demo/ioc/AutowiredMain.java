package com.zhenwei.spring.demo.ioc;

import java.util.stream.Stream;

/**
 * @description: 自定义模拟实现
 * {@link org.springframework.beans.factory.annotation.Autowired } 注解
 * @see javax.annotation.Resource
 * @see org.springframework.beans.factory.annotation.Autowired
 * @author zhangzhenwei
 * @date 2021/1/2 12:27 下午
 */
public class AutowiredMain {

	public static void main(String[] args) {
		UserController userController = new UserController();

		Class<? extends UserController> clazz = userController.getClass();

		Stream.of(clazz.getDeclaredFields()).filter(field -> {
			field.setAccessible(true);
			MineAutowired annotation = field.getAnnotation(MineAutowired.class);
			return annotation != null;
		}).forEach(field -> {
			// 方法属性全类名. 若此类需要其他注入,或循环依赖,则可以进行
			String classFullName = field.getGenericType().getTypeName();

			Object service = null;
			try {
				//构造对象
				service = Class.forName(classFullName).newInstance();
				service = field.getType().newInstance();

				//为userController属性userService赋值
				field.set(userController, service);

			} catch (Exception ignore) {
				ignore.printStackTrace();
			}

		});
		userController.singMusic();
	}



}
