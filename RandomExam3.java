package day02;
import java.util.Scanner;
import java.util.Random;

public class RandomExam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int com;
		String me, com1;
		
		System.out.println("## 가위바위보 게임 ##");
		
		while(true) {
			System.out.print("(1.가위  2.바위  3.보  0.종료) 선택하시오 : ");
			me = sc.next();
			com = ran.nextInt(3)+1;
			if(com == 1) {
				com1 = "가위";
			}else if(com == 2) {
				com1 = "바위";
			}else {
				com1 = "보";
			}
			if(me.equals("0")) break;
			
			System.out.println("유저 : " + me + " vs 컴퓨터 : " + com1);
			
			if(me.equals(com1)) {
				System.out.println("무승부입니다.");
			}else if((me.equals("가위") && com1.equals("보")) ||
					(me.equals("바위") && com1.equals("가위")) ||
					(me.equals("보") && com1.equals("바위"))) {
				System.out.println("승리입니다.");
			}else {
				System.out.println("패배입니다.");
			}
			
		}

	}

}
