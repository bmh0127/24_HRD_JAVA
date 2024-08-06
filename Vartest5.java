package day01;
import java.util.Scanner;
/*
 * 4칙연산과 나머지 연산을 하는 간단한 계산기 예제
 */

public class Vartest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 4칙 연산을 입력 받아 저장하는 변수 선언
		System.out.print("다음 연산자 중 하나를 입력하시오(+, -, *, /, %) : ");
		String x = sc.next();
		
		// 2. 2개 정수 입력 받아 저장하는 변수 선언
		System.out.print("첫번째 정수를 입력하시오 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수를 입력하시오 : ");
		int b = sc.nextInt();
		int y;
		
		// 3. "+" 덧셈, "-" 뺄셈, "*" 곱샘, "/" 나누기, "%" 나머지
		if(x.equals("+")) {
			y = a + b;
			System.out.println(a + " + " + b + " = " + y);
		}else if(x.equals("-")) {
			y = a - b;
			System.out.println(a + " - " + b + " = " + y);
		}else if(x.equals("*")) {
			y = a * b;
			System.out.println(a + " * " + b + " = " + y);
		}else if(x.equals("/")) {
			y = a / b;
			System.out.println(a + " / " + b + " = " + y);
		}else if(x.equals("%")) {
			y = a % b;
			System.out.println(a + " % " + b + " = " + y);
		}
		

	}

}
