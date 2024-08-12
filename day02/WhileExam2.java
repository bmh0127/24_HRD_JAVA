package day02;

public class WhileExam2 {

	public static void main(String[] args) {
		// 
		
		int num = 20;
		
		while(num > 10) {
			System.out.println(num--);
		}
		
		boolean flag = true;
		
		while(flag) {
			num--;
			if(num == 3) {
				System.out.println("num = 3 종료");
				flag = false;
			}
		}
		
		

	}

}
