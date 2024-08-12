package day03;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		
		// 2차원 배열
		
		int[][] score = new int[2][3];
		
		score[0][0] = 90;
		score[0][1] = 50;
		score[0][2] = 80;
		score[1][0] = 100;
		score[1][1] = 70;
		score[1][2] = 90;
		
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
		}
		
		avg = sum / (score.length * score[0].length);
		
		System.out.println("총점 : " + sum + " 평균 : " + avg);

	}

}
