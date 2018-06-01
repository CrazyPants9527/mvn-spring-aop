package net.study.spring.aop.aspect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.study.spring.aop.IHello;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-aop-advice.xml" })
public class AspectAdviceTest {

	@Autowired
	private IHello ihello;
	
	@Test
	public void test1(){
		ihello.sayHello("李蛋");
	}
	
	@Test
	public void aroundtest(){
		ihello.sayHello("李蛋");
	}
	
	@Test
	public void afterReturningTest(){
		ihello.getMag("呵呵");
	}
	
	@Test
	public void throwExMethodTest(){
		ihello.throwEx();
	}
}
