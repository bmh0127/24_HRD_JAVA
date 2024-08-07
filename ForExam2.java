package day02;

public class ForExam2 {

	public static void main(String[] args) {
		// 1에서 100까지 짝수들의 총합을 계산하여 출력하시오.
		
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}else {
				sum = sum;
			}
		}
		
		System.out.println("1에서 100까지 짝수들의 총합 = " + sum);

	}

}
