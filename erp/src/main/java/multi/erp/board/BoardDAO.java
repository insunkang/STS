package multi.erp.board;

import java.util.List;

public interface BoardDAO {
	//게시판목록보기
	List<BoardVO> boardList();
	//게시판등록
	int insert(BoardVO board);
	List<BoardVO> searchList(String search);
	List<BoardVO> searchList(String tag,String search);
	List<BoardVO> pageList();
	//상세보기
	BoardVO read(String board_no);
	//�Խñۼ���
	int update(BoardVO board);
	//�Խñۻ���
	int delete(String board_no);
}
