package day04;
import java.util.Scanner;
import java.util.ArrayList;
public class JopApp {
	static Person p1;
	ArrayList<Person> arrlist = new ArrayList<Person>();
	
	public void showMenu() {
		System.out.println("**********JOB v1.1************");
		System.out.println("** 1. 구직 등록 **");
		System.out.println("** 2. 구인 등록 **");
		System.out.println("** 3. 구직자 정보 출력 **");
		System.out.println("** 4. 구인회사 정보 출력 **");
		System.out.println("** 5. 종료 **");
		System.out.println("*****************************");
		System.out.println(" 메뉴 번호를 입력하세요 >> ");
		System.out.println("*****************************");
	}// showMenu()---------------------------
	
	public void inputPerson() {
		// 이름, 나이, 성별, 전화번호를 입력받아 Person 객체에 저장 // 
		Scanner sc = new Scanner(System.in);
		p1 = new Person();
		
		System.out.println("------구직 등록 start ------");
		System.out.print("이름 입력 >> ");
		p1.name = sc.next();	// !!@#
		System.out.print("나이 입력 >> ");
		p1.age = sc.nextInt();
		System.out.println("---성별 메뉴---");
		System.out.println(" 1.남자  2.여자");
		System.out.println("---------------");
		System.out.print("성별 메뉴 번호 입력 >> ");
		int s = sc.nextInt();
		if(s == 1)
			p1.gender = 'M';
		else if(s == 2)
			p1.gender = 'F';
		else
			System.out.println("지원되지 않는 메뉴 번호입니다.");
		System.out.print("전화번호 입력 >> ");
		p1.tel = sc.next();  	// !@#!@#
		
		arrlist.add(p1);
	}// --------------------------------- inputPerson()
	
	// 구직자 정보출력 메소드
	void showInfo() {
		for(Person p : arrlist) {
			p.getInfo();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JopApp j1 = new JopApp();
		
		while(true) {
			j1.showMenu();
			int num = sc.nextInt();
			if(num == 1) {
				j1.inputPerson();
			}else if(num == 3) {
				j1.showInfo();
			}else if(num == 5) {
				break;
			}
		}//--------------------------while
		
		System.out.println("구직 등록이 종료되었습니다.");

	}

}
