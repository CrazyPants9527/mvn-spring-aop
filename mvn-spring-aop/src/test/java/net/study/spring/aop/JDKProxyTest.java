package net.study.spring.aop;

import org.junit.Test;

import net.study.spring.aop.jdkproxy.JDKDynaproxyFactory;

public class JDKProxyTest {

	@Test
	public void test1(){
		IHello helloimpl= new HelloImpl();
		IHello helloproxy= (IHello)new JDKDynaproxyFactory().createProxy(helloimpl);
		helloproxy.sayHello("学习使我快乐");
	}
}
