package net.study.spring.aop;

import org.junit.Test;

import net.study.spring.aop.cglib.CglibProxyFactory;
import net.study.spring.aop.cglib.Study;

public class cglibTest {

	@Test
	public void test1(){
		Study study=(Study)  new CglibProxyFactory().getProxy(Study.class);
		study.studybook("spring");
	}
}
