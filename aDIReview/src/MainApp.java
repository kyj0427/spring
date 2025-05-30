import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myreview.service.ReplyService;
import myreview.vo.ReplyVO;

public class MainApp {

	public static void main(String[]args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ctx.xml"); 
		
		ReplyVO rvo = (ReplyVO)ctx.getBean("reply");
		
		ReplyService replyservice = (ReplyService)ctx.getBean("ReplyService");
		replyservice.insertReply(rvo);
	}
}
