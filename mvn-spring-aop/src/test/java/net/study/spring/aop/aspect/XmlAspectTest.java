package net.study.spring.aop.aspect;

import org.junit.runner.RunWith;

 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import net.study.spring.aop.HelloImpl;
import net.study.spring.aop.IHello;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-aop.xml" })
public class XmlAspectTest {

	@Autowired
	private IHello ihello;
	
	@Test
	public void test1(){
		ihello.sayHello("董事长");
	}
}
