import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import board.BoardService;
import board.vo.BoardVO;

public class MainApp {
	public static void main(String[] args) {
		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");

		// 2. Spring 컨테이너로부터 BoardServiceImpl 객체를 Lookup한다.
		BoardService boardService = (BoardService) container.getBean("boardServiceImpl");

		// 3. 글 등록 기능 테스트
//		BoardVO vo = new BoardVO();
//		vo.setTitle("spring mybatis");
//		vo.setWriter("홍길동S");
//		vo.setContent("임시 내용..............");
//		boardService.insertBoard(vo);

		// 4. 글 목록 검색 기능 테스트		
		BoardVO svo = new BoardVO();
		List<BoardVO> boardList = boardService.getBoardList(svo);
		for (BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}

		// 5. Spring 컨테이너 종료
		container.close();
	}
}