package aop1_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext("aop1_xml/ctx.xml");

		MessageBean bean = (MessageBean)ctx.getBean("targetBean");
		bean.sayHello();
		System.out.println("--------------");
		bean.engSayHello();
		System.out.println("--------------");
		bean.test();
		
	}

}
