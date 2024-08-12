package day03;

public class JopApp {

	public static void main(String[] args) {
		
		// person 객체 생성
		Person hong = new Person();
		hong.age = 21;
		hong.name = "홍길동";
		hong.blood = 'A';
		
		hong.먹다();
		hong.웃다();
		
		System.out.println(hong.age + hong.name + hong.blood);
		

	}

}
