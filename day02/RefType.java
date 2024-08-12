package day02;

public class RefType {

	public static void main(String[] args) {
		
		RefType ref = new RefType();	
		RefType ref2 = new RefType();	//ref와 ref2가 가르키는 주소는 다르다.
		
		if(ref == ref2) {
			System.out.println("동일한 주소를 갖는 객체입니다.");
		}else {
			System.out.println("서로 다른 주소를 갖는 객체입니다.");
		}
		
		String name = new String("변무혁");
		String name1 = "가나다 라마바사";
		
		System.out.println(name.charAt(0));
		System.out.println(name1.length());
		System.out.println(name1.replace("가나다", "아자차"));
		
		int[] score = new int[5];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i]; 
		}
		
		System.out.println(sum);
		
	}
	
}
