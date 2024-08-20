package day09;
import java.sql.*;
import java.io.FileInputStream;

public class BoardInsertExample {

	public static void main(String[] args) {
		Connection con = null;
		try {
			// 1. JDBC 드라이버 로딩...
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 데이터 베이스 연결
			String url = "jdbc:mysql://localhost:3306/contacts";
			String id = "root";
			String pwd = "1234";
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("DB 연결 성공~~");
			
			// 3. sql 실행하기 위한 Statement, PreparedStatement 객체생성
			String sql3 = "insert into boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata) values (?,?,?,now(),?,?)";
			PreparedStatement pst3 = con.prepareStatement(sql3, Statement.RETURN_GENERATED_KEYS);
			
			pst3.setString(1, "눈 오는 날");
			pst3.setString(2, "함박눈이 내려요.");
			pst3.setString(3, "winter");
			pst3.setString(4, "snow.jpg");
			pst3.setBlob(5, new FileInputStream("C:\\Users\\COMPUTER\\eclipse-workspace\\JavaOOP\\src\\day09\\snow.jpg"));
			
			// 4. 데이터 추가 명령 전송하기 
			int result = pst3.executeUpdate();
			
			if(result > 0) {
				System.out.println("데이터 저장 성공~~");
			}else {
				System.out.println("데이터 저장 실패!!!");
			}
			
		} catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
		} finally {
			try {
				con.close();
			} catch(SQLException e) {
				
			}
		}
		
		
	}

}
