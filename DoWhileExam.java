package day02;
import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		String mes;
		
		do {
			System.out.print(">> ");
			mes = sc.next();	
			System.out.println(mes);
			
		}while(!mes.equals("q"));
		
		System.out.println("프로그램 종료");

	}

}
