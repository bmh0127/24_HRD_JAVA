package day10;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample {
	
	Scanner sc = new Scanner(System.in);
	static DataModel dm = null;
	
	public BoardExample() {
		dm = new DataModel();
	}
	
	public void mainMenu() throws SQLException {
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		System.out.println();
		
		switch(menuNo) {
		case "1" -> dm.create();
		case "2" -> dm.read();
		case "3" -> dm.clear();
		case "4" -> dm.exit();
		}
		
	}

	private void exit() {
		System.exit(0);
	}

	private void clear() throws SQLException {
		System.out.println("*** clear() 메소드 실행됨");
		dm.list();
	}

	private void read() throws SQLException {
		System.out.println("*** read() 메소드 실행됨");
		dm.list();
	}

	private void create() throws SQLException {
		System.out.println("*** create() 메소드 실행됨");
		dm.list();
	}
	
	public static void main(String[] args) throws SQLException {
		BoardExample be = new BoardExample();
		be.mainMenu();
	}
	
}
