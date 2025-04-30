package myreview.model;

import org.springframework.stereotype.Repository;

import myreview.vo.ReplyVO;

@Repository

public class ReplyDaoImpl implements ReplyDao{

	@Override
	public void insertReply(ReplyVO vo) {
		System.out.println("추후 디비에 입력합니다");
		System.out.println(vo.toString());
		
	}

	

}
