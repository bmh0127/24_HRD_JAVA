package day06;

// 추상클래스에서는 생성자 만들지 못함

public abstract class Product{
	
	String pname;
	int price;
	
	public void printDetail() {
		System.out.print("상품명 : " + pname + ", ");
		System.out.print("가격 : " + price + ", ");
		printExtra();		 // 템플릿 패턴 메소드
	}
	
	// 추상 메소드
	public abstract void printExtra();	
}
