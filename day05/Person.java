package day05;

public class Person {
	
	// 이름, 나이 정보은닉
	private String name;
	private int age;
	
	// 인자 생성자
	public Person(){}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter, setter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 이름, 나이 정보를 반환하는 메소드 personInfo()
	public String personInfo() {
		String info = "이름 : " + name + "\n나이 : " + age;
		return info;
	}
	
	//전체 사람 정보를 출력하는 메소드 printAll()
	public void printAll() {
		System.out.println(this.personInfo());
	}
	
	static void inputPerson() {
		System.out.println("===============");
		System.out.println("이름 입력 : ");
		System.out.println("나이 입력 : ");
		System.out.println("===============");
	}
	
	
	

}
