package board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.BoardDao;
import board.BoardService;
import board.vo.BoardVO;

//***********************


@Service("boardService")
public class BoardServiceImpl implements BoardService {
	

	//***********************	
	
	
	@Autowired
	private BoardDao boardDAO;
	
	
	// 메소드오버라이딩
	@Override
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}
