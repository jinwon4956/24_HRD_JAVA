package day08;
import java.util.List;

class Board{
private String title;
private String content;
	
	public Board(String title,String content) {
		this.title = title;
		this.content = content;
			
}
	public String getTitle() {
		return title;
	
}
	public String getContent() {
		return content;
	}
	
}
class BoardDao{
	Board board;
	List<Board> getBoardList(){
	
		public BoardDao(Board board) {
		this.board = board;
	}
	public BoardDao() {
		
	}
		List<Board> list =new ArrayList<Board>();
		list.add(board);
		return list;
	}

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardDao board1 = new Board("제목1", "내용1");
		BoardDao board2 = new Board("제목2","내용2");
		BoardDao board3 = new Board("제목3", "내용3");
	}

}
}