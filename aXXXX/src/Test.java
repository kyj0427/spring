import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myreview2.service.ReplyService;
import myreview2.vo.ReplyVO;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("myreview2/xxx.xml"); 	
		
//		ReplyVO reply = (ReplyVO)ctx.getBean("reply");	
//		
//		//ReplyService replyService = (ReplyService)ctx.getBean("replyServiceImpl");//별칭사용안함  아이디 소문자		
//		ReplyService replyService = (ReplyService)ctx.getBean("replyService");//별칭
//		
//		// 인터페이스에 component했으나 
//		replyService.insertReply(reply);
	}

}
