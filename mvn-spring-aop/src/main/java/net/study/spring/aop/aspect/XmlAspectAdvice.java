package net.study.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAspectAdvice {

	public void beforeMethod(){
		System.out.println("------beforeMethod----");
	}
	public void afterMethod(){
		System.out.println("------afterMethod----");
	}
	public void aroundMethod(ProceedingJoinPoint joinPoint) {
		System.out.println("------aroundMethod----");
		String targetClassName = joinPoint.getTarget().getClass().getName();
		String targetMethodName = joinPoint.getSignature().getName();
		System.out.println(targetClassName + " 中的 " + targetMethodName
				+ "调用前被拦截了");
		try {
			joinPoint.proceed();//调用目标方法
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println(targetClassName + " 中的 " + targetMethodName
				+ "调用之后被拦截了");
	}
	public void afterReturning(JoinPoint joinPoint, String result) {
		System.out.println("------afterReturning----");
		Class<?> class1 = joinPoint.getTarget().getClass();
		String methodName = joinPoint.getSignature().getName();
		System.out.println(class1.getName() + "的" + methodName
				+ "调用完毕,目标方法返回值：" + result);
	}
	
	public void throwExMethod(JoinPoint joinPoint, Exception ex) {
		System.out.println("------throwExMethod----");
		Class<?> class1 = joinPoint.getTarget().getClass();
		String methodName = joinPoint.getSignature().getName();
		System.out.println(class1.getName() + "的" + methodName + "调用完毕,方法出异常了："
				+ ex.getMessage());
	}
}
