package day03;
public class Car {
	
	// 속성
	String company;
	String model;
	String color;
	
	int maxSpeed;
	int rpm;
	int speed;
	
	// 기본 생성자 : 1. 객체를 생성할 때 사용  2. 멤버 변수 초기화 할 때 사용
	// 생성자 오버로딩 : 생성자를 여러 개 선언하는 것!
	public Car() {
		
	}
	// 인자 생성자 (오버로딩)
	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model =model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	public Car(String company, String model, String color) {
		this(company, model, color, 200);
	}
	
	// 메소드
	void CarInfo() {
		System.out.println("==========================");
		System.out.println("제조회사 : " + company);
		System.out.println("모    델 : " + model);
		System.out.println("색    깔 : " + color);
		System.out.println("최고속도 : " + maxSpeed);
		System.out.println("==========================");
		
	}

}
