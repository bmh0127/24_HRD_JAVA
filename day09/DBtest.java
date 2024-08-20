package day09;
import java.sql.*;


public class DBtest {

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
			String sql = "INSERT INTO person values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, "이길동");
			pst.setString(2, "010-4567-1894");
			pst.setString(3, "lee@ac.kr");
			pst.setInt(4, 20);
			
			// 4. 데이터 추가 명령 전송하기 
			int result = pst.executeUpdate();
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
