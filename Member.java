package day03;

public class Member {
	
	String name;
	String id;
	String password;
	int age;
	
	public Member() {
		
	}
	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	public Member(String name, String id) {
		this(name, id, "1234", 20);
	}
	
	public boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}

}
