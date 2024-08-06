package day01;

public class Vartest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수형 변수 2개 선언하기. i, j
		// 문자열 변수 1개 선언하기. var1
		// 문자형 변수 1개 선언하기. var2
		
		int i = 10, j = 20;
		String var1 = "안녕";
		char var2 = 'A';
		
		// 정수형 변수 1개와 문자열 변수 연결해서 출력하기
		System.out.println(i + var2);
		
		// 정수형 변수 1개와 문자형 변수 연결해서 출력하기
		System.out.println(var2);
		
		// 강제 형 변환
		double k = 3.141592;
		
		j = j + (int)k;
		
		System.out.println("j값:"+j+"\nk값:"+k);
	}

}
