package aop2_annotation.copy;

import org.springframework.stereotype.Component;

@Component("targetBean") //객체로 올라와야할때 (반드시 별칭을준다)
public class MessageBinImpl implements MessageBean{

	@Override
	public void sayHello() {
		System.out.println("sayHello() 호출");
		
	}

	@Override
	public void engSayHello() {
		System.out.println("engsayHello() 호출");		
	}

	@Override
	public void test() {
		System.out.println("test() 호출");		
	}


	
}
