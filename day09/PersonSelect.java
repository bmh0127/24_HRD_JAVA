package day09;
import java.sql.*;
import java.util.ArrayList;


class Person{
	private String name;
	private String phone;
	private String email;
	private int age;
	
	public Person() {}
	public Person(String name, String phone, String email, int age) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class PersonSelect {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

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
//			String sql = "select name, phone from person";
			// 이름이 홍길동과 같은 사람의 모든 열의 정보를 검색해서 출력하기
			String sql2 = "select * from person ";
			st = con.createStatement();
			rs = st.executeQuery(sql2);
			
			String name = "";
			String phone = "";
			String email = "";
			int age = 0;
			Person person = null;
			ArrayList<Person> arr = new ArrayList<Person>();
			while(rs.next()){
				name = rs.getString("name");
				phone = rs.getString("phone");
				email = rs.getString("email");
				age = rs.getInt("age"); 
				person = new Person(name, phone, email, age);
				arr.add(person);
			}
			for(Person p : arr) {
				System.out.println("이름: " + p.getName());
				System.out.println("전화번호: " + p.getPhone());
				System.out.println("email: " + p.getEmail());
				System.out.println("나이: " + p.getAge());				
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
