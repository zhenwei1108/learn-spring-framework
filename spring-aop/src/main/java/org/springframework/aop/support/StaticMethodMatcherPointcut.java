/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.aop.support;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

import java.lang.reflect.Method;

/**
 * Convenient superclass when we want to force subclasses to implement the
 * {@link MethodMatcher} interface but subclasses will want to be pointcuts.
 *
 * <p>The {@link #setClassFilter "classFilter"} property can be set to customize
 * {@link ClassFilter} behavior. The default is {@link ClassFilter#TRUE}.
 *
 * @author Rod Johnson
 * @author Juergen Hoeller
 *
 * 静态切入点
 * 	先使用 getClassFilter（） 进行类的校验。 详见{@link ClassFilter#matches(Class)}  匹配：true  否则： false
 * 	后使用 getMethodMatcher（）进行方法的校验， 详见{@link MethodMatcher}
 * 	在 MethodMatcher 中， 静态切入，先使用 {@link MethodMatcher#isRuntime()} 校验是静态还是动态， 静态：false ， 动态：true
 * 	然后使用{@link MethodMatcher#matches(Method, Class)} 适用性检查，并缓存检查结果。
 * 	完毕
 * 	动态切入：见{@link DynamicMethodMatcherPointcut} 操作
 *
 */
public abstract class StaticMethodMatcherPointcut extends StaticMethodMatcher implements Pointcut {

	private ClassFilter classFilter = ClassFilter.TRUE;


	/**
	 * Set the {@link ClassFilter} to use for this pointcut.
	 * Default is {@link ClassFilter#TRUE}.
	 */
	public void setClassFilter(ClassFilter classFilter) {
		this.classFilter = classFilter;
	}

	@Override
	public ClassFilter getClassFilter() {
		return this.classFilter;
	}


	@Override
	public final MethodMatcher getMethodMatcher() {
		return this;
	}

}
