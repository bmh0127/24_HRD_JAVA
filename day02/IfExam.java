package day02;
import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오 : ");
		
		int jumsu = sc.nextInt();
		
		String hakjum;
		
		if(jumsu >= 95) {
			hakjum = "A+";
		}else if(jumsu >=90) {
			hakjum = "A0";
		}else if(jumsu >=85) {
			hakjum = "B+";
		}else if(jumsu >=80) {
			hakjum = "B0";
		}else if(jumsu >=75) {
			hakjum = "C+";
		}else if(jumsu >=70) {
			hakjum = "C0";
		}else {
			hakjum = "F";
		}
		
		System.out.println("당신의 점수는 "+ jumsu + "점이고 학점은 " + hakjum + "입니다.");

	}

}
