package day02;

public class Game369 {

	public static void main(String[] args) {
		// 369 게임하기
		
		int num = 1;
		
		while(num <= 10) {
			if(num % 3 == 0) {
				System.out.println("짝");
				num++;
				continue;
			}
			System.out.println(num);
			num++;
		}

	}

}
