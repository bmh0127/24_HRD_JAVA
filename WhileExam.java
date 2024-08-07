package day02;

public class WhileExam {

	public static void main(String[] args) {
		// 1에서 100까지 짝수들의 총합을 계산하여 출력하시오.
		
		int i = 0, sum = 0;
		
		while(i<=100) {
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println("1에서 100까지 짝수들의 총합 = " + sum);

	}

}
