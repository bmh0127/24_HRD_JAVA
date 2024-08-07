package day02;
import java.util.Scanner;
import java.util.Random;

public class RandomExam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int me, com;
		
		System.out.println("## 가위바위보 게임 ##");
		
		while(true) {
			System.out.print("(1.가위  2.바위  3.보  0.종료) 선택하시오 : ");
			me = sc.nextInt();
			com = ran.nextInt(3)+1;
			if(me == 0) break;
			
			if(me == com) {
				System.out.println("무승부입니다.");
			}else if((me == 1 && com == 3) ||
					(me == 2 && com == 1) ||
					(me == 3 && com == 2)) {
				System.out.println("승리입니다.");
			}else {
				System.out.println("패배입니다.");
			}
			
		}

	}

}
