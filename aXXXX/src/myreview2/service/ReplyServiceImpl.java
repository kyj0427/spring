package myreview2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myreview2.vo.ReplyVO;

@Service("replyService")
public class ReplyServiceImpl implements ReplyService {
	//@Autowired	//스프링이 만든 객체를 주입해줘. 여기에서는 Repository가 필요해서 Autowired //private CustomerRepository repository; 	
	//private ReplyDaoImpl replyDaoImpl;
	
	@Override
	public void insertReply(ReplyVO vo) {
		//replyDaoImpl.insertReply(vo);
		System.out.println(vo + "가 저장되었습니다.");
	};	
	
}
