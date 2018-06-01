package net.study.spring.aop;
/**
 * 实体类
 * @author Administrator
 *
 */
public class HelloImpl implements IHello{

	 
	public void sayHello(String name){;
		System.out.println("你好----"+name);
	}
	public String getMag(String name){
		return "你好----"+name;
	}
	public void throwEx(){
		if(true){
			throw new RuntimeException("自定义异常。。。。");
		}
	}
}
