package day08;
import java.util.List;

class Board {
	private String title;
	private String content;
	
	public Board(String title, String content) {
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
	
	List<Board> getBoardList(){
		List<Board> list = new List<Board>();
		list.add(new Board("제목1", "제목1"));
		list.add(new Board("제목2", "제목2"));
		list.add(new Board("제목3", "제목3"));
	}

}

public class ListExam {
	public static void main(String[] args) {

		
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}

	}

}
