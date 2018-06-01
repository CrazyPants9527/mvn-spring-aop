package net.study.spring.aop;

public class HelloProxy implements IHello {

	/**
	 * 用接口实现代理
	 */
	private IHello ihello;
	public HelloProxy(IHello ihello){//传入并声明一个局部变量ihello
		this.ihello=ihello;			 //将局部变量ihello赋值给this.ihello（成员变量）
	}
	public void sayHello(String name) { 		//切面
		// TODO Auto-generated method stub		//
		System.out.println("日志开始生成。。");		//
		ihello.sayHello(name);					//结合点
		System.out.println("日志关闭生成。。");		//	
	}
	public String getMag(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	public void throwEx() {
		// TODO Auto-generated method stub
		
	}
	
	
	/**
	 * 不用接口实现代理
	 */
//	private HelloImpl helloImpl;
//	public HelloProxy(HelloImpl helloImpl){
//		this.helloImpl=helloImpl;
//	}
//
//	public void sayHello(String name) {
//		// TODO Auto-generated method stub
//		System.out.println("日志开始生成。。");
//		helloImpl.sayHello(name);
//		System.out.println("日志关闭生成。。");
//	}
}
