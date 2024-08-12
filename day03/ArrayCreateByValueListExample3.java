package day03;

public class ArrayCreateByValueListExample3 {

	public static void main(String[] args) {
		
		// 2차원 배열
		
		int[][] score = {
				{80,90,96},
				{76,88}
		};
		
		System.out.println("1차원 배열 길이(반의 수) : " + score.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수) : " + score[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수) : " + score[1].length);
		
		// 첫 번째 반의 세 번째 학생의 점수 읽기
		System.out.println("score[0][2] : " + score[0][2]);
		
		// 두 번째 반의 두 번째 학생의 점수 읽기
		System.out.println("score[1][1] : " + score[1][1]);
		
		// 첫 번째 반의 평균 점수 구하기
		int class1Sum = 0;
		for(int i = 0; i < score[0].length; i++) {
			class1Sum += score[0][i];
		}
		double class1Avg = class1Sum / score[0].length;
		System.out.println("첫 번째 반의 평균 점수 : " + class1Avg);
		
		// 두 번째 반의 평균 점수 구하기
				int class2Sum = 0;
				for(int i = 0; i < score[1].length; i++) {
					class2Sum += score[1][i];
				}
		double class2Avg = class2Sum / score[1].length;
		System.out.println("두 번째 반의 평균 점수 : " + class2Avg);
		
		// 전체 학생의 평균 점수 구하기
		int totalStudent = 0;
		int totalSum = 0;
		
		for(int i = 0; i < score.length; i++) {
			totalStudent += score[i].length;
			for(int j = 0; j < score[i].length; j++) {
				totalSum += score[i][j];
			}
		}
		
		double totalAvg = totalSum / totalStudent;
		
		System.out.println("전체 학생의 평균 점수 : " + totalAvg);

	}

}
