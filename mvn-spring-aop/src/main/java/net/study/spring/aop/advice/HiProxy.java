package net.study.spring.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Repository;

/**
 * 代理类
 * @author Administrator
 *
 */

public class HiProxy {

	public void beforeMethod(JoinPoint joinPoint){
		System.out.println("*****XmlAspect's before(JoinPoint joinPoint)*****");
		Class class1 = joinPoint.getTarget().getClass();
		String methodName = joinPoint.getSignature().getName();
		System.out.println(class1.getName() + "的" + methodName + "将要被调用...");
	}
}
