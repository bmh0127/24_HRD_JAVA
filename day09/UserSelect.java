package day09;
import java.sql.*;


public class UserSelect {

	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement st = null;
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
			// 이름이 홍길동과 같은 사람의 모든 열의 정보를 검색해서 출력하기
			String sql2 = "select * from users where userid = ?";
			st = con.prepareStatement(sql2);
			st.setString(1, "lee");
			
			rs = st.executeQuery();
			
			if(rs.next()) {
				System.out.println("조회 성공");
				String name = rs.getString("username");
				int age = rs.getInt("userage");
				System.out.println("이름: " + name);
				System.out.println("나이: " + age);
			}
			
		} catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
		} finally {
			try {
				con.close();
				st.close();
				rs.close();
				System.out.println("연결 끊기");
			} catch(SQLException e) {
				
			}
		}
		
		
	}

}
