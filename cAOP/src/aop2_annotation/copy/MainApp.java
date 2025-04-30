package aop2_annotation.copy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext("aop2_annotation/ctx.xml");

		MessageBean bean = (MessageBean)ctx.getBean("targetBean");
		bean.sayHello();
		System.out.println("--------------");
		bean.engSayHello();
		System.out.println("--------------");
		bean.test();
		
	}

}
