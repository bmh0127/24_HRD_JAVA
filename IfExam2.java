package day02;
import java.util.Scanner;

public class IfExam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		String name;
		
		System.out.println("## 로그인(admin 혹은 임의 아이디)##");
		System.out.print("# 로그인 아이디 : ");
		name = sc.next();
		
		if(name.equals("admin")) {
			System.out.println("관리자로 로그인!!");
		}else {
			System.out.println(name + " 로그인!! ");
		}
		System.out.print("## 메뉴를 선택하세요(1~2) ## ");
		System.out.print("# 메뉴 선택 : ");
		
		i = sc.nextInt();
		
		if(i == 1 && name.equals("admin")) {
			System.out.println(name + " " + i + "번 선택함!!");
		}else if(i == 1 && !name.equals("admin")) {
			System.out.println(name + " " + i + "번 선택함!!");
		}else if(i == 2 && name.equals("admin")) {
			System.out.println(name + " " + i + "번 선택함!!");
		}else {
			System.out.println(name + " " + i + "번 선택함!!");
		}
		
	}

}
