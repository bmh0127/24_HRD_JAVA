package day04;

public class Person {
	
	// 객체 모델링 클래스 멤버
	
	// 속성 : has -a
	String num;
	int money;
	String name;
	int age;
	char gender;	// 'F', 'M'
	String tel;	
	
	// 기본 생성자
	public Person() {
		
	}
	
	// 메소드

	void getInfo() {
		System.out.println("-------------------------");
		System.out.println(this.name + "님 정보");
		System.out.println("나이 : " + this.age);
		System.out.println("성별 : " + this.gender );
		System.out.println("전화번호 : " + this.tel);
		System.out.println("-------------------------");
	}
	void getInfo1() {
		System.out.println("-------------------------");
		System.out.println(this.num + "   " + this.name + "   " + this.money);
		System.out.println("-------------------------");
	}

}
