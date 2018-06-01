package net.study.spring.aop.aspect;
/**
 * 代理类
 * @author Administrator
 *
 */
public class XmlAspect {

	public void beforeMethod(){
		System.out.println("beforeMethod--日志生成");
	}
}
