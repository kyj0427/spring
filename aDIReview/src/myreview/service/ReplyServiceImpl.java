package myreview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import myreview.model.ReplyDao;
import myreview.vo.ReplyVO;


@Component("ReplyService") //별칭 : Main에서 부름, 별칭없으면 클래스명 (클래스명을 가져올때는 첫글자 소문자로)
 public class ReplyServiceImpl implements ReplyService{
	
	
	@Override
	public void insertReply(ReplyVO vo) {
		replyDaoImpl.insertReply(vo);
		
	}

	@Autowired
	private ReplyDao replyDaoImpl;
	
	
	
}
