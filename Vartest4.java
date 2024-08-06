package day01;
import java.util.Scanner;

public class Vartest4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("출생연도를 입력하시오 : ");
		int year = scan.nextInt();
		System.out.print("Korea 또는 Year를 입력하시오 : ");
		String age_type = scan.next();
		int answer = 0;
		
		if(age_type.equals("Korea")) {
			answer = 2024 - year + 1;
		}else if(age_type.equals("Year")) {
			answer = 2024 - year;
		}
		System.out.println("현재 나이 : " + answer);
		
		
	}

}
