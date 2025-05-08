package board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.BoardDAO;
import board.vo.BoardVO;

@Repository
public class BoardDAOMybatis{

	@Autowired
	private SqlSessionTemplate mybatis;
	/*
	 *   연결객체
	 * 		- JDBC    : Connection
	 * 		- Mybatis : SqlSession
	 */
	
	
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Mybatis insertBoard() 호출");
		mybatis.insert("korea.ict.class3.insertBoard", vo);
	}

	public void updateBoard(BoardVO vo) {
		System.out.println("===> Mybatis updateBoard() 호출");
		mybatis.update("korea.ict.class3.updateBoard", vo);
	}

	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Mybatis deleteBoard() 호출");
		mybatis.delete("korea.ict.class3.deleteBoard", vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Mybatis getBoard() 호출");
		return (BoardVO) mybatis.selectOne("korea.ict.class3.getBoard", vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Mybatis getBoardList() 호출");
		List<BoardVO> resultList = mybatis.selectList("korea.ict.class3.selectAllList", vo);
//		for(BoardVO temp: resultList) {
//			System.out.println(temp.toString());
//		}		
		return resultList;
	}
	
	
	
	
}