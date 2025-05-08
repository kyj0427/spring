package board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.BoardService;
import board.vo.BoardVO;


@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	//private BoardDAOMybatis boardDAO;
	private BoardDAOMybatis boardDAOMybatis;

	public void insertBoard(BoardVO vo) {

		boardDAOMybatis.insertBoard(vo);
	}

	public void updateBoard(BoardVO vo) {
		boardDAOMybatis.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		boardDAOMybatis.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		return boardDAOMybatis.getBoard(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAOMybatis.getBoardList(vo);
	}
}