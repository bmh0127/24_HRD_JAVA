package day09;
import java.sql.*;
import java.io.*;

public class BoardSelect {

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
			String sql2 = "select * from boards where bwriter = ? ";
			st = con.prepareStatement(sql2);
			st.setString(1, "winter");
			
			rs = st.executeQuery();
			
			while(rs.next()) {
				System.out.println("조회 성공");
				int bno = rs.getInt("bno");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				String bwriter = rs.getString("bwriter");
				String bdate = rs.getDate("bdate").toString();
				String bfilename = rs.getString("bfilename");
//				String bfiledata = null;
				Blob blob = rs.getBlob("bfiledata");
				
				InputStream is = blob.getBinaryStream();
				OutputStream os = new FileOutputStream("C:\\Users\\COMPUTER\\eclipse-workspace\\JavaOOP\\src\\day09\\snow.jpg");
				is.transferTo(os);
				
				System.out.println("번호: " + bno);
				System.out.println("타이틀: " + btitle);
				System.out.println("내용: " + bcontent);
				System.out.println("작성자: " + bwriter);
				System.out.println("작성일: " + bdate);
				System.out.println("파일이름: " + bfilename);
//				System.out.println("그림: " + bfiledata);
				
				os.flush();
				os.close();
				is.close();
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
