package day09;
import java.sql.*;

public class UserinsertExample {

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
			String sql2 = "INSERT INTO users values (?,?,?,?,?)";
			PreparedStatement pst2 = con.prepareStatement(sql2);

			pst2.setString(1, "lee");
			pst2.setString(2, "이자바");
			pst2.setString(3, "1234");
			pst2.setInt(4, 21);
			pst2.setString(5, "lee@a.com");
			
			// 4. 데이터 추가 명령 전송하기 
			int result = pst2.executeUpdate();
			
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
