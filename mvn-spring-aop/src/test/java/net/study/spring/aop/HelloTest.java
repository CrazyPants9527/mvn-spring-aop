package net.study.spring.aop;

import org.junit.Test;
/**
 * 
 * @author Administrator
 *
 */
public class HelloTest {

	/**
	 * 用接口实现代理
	 */
	@Test
	public void test1(){		
		IHello ihello=new HelloImpl();
		IHello helloProxy = new HelloProxy(ihello);
		helloProxy.sayHello("李骏填");
	}
	
	/**
	 * 不用接口实现代理
	 */
	@Test
	public void test2(){		
		HelloImpl ihello=new HelloImpl();
		HelloProxy helloProxy = new HelloProxy(ihello);
		helloProxy.sayHello("李骏填");
	}
}
