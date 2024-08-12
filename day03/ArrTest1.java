package day03;
import java.util.Scanner;

public class ArrTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int su = 0;
		int[] student = null;		// 배열 선언!!
		
		while(flag) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택 > ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num == 1) {
				System.out.print("학생수 > ");
				su = Integer.parseInt(sc.nextLine());	//  nextLine 메소드 사용!!
				student = new int[su];					//  배열 초기화!!
				
			}else if(num == 2) {
				for(int i = 0; i < student.length; i++) {
					System.out.print(i+1 + "번째 학생 점수 입력 > ");
					student[i] = Integer.parseInt(sc.nextLine());
				}
			}else if(num == 3) {
				for(int i = 0; i < student.length; i++) {
					System.out.println(i+1 + "번째 학생 점수 : " + student[i]);
				}
			}else if(num == 4) {
				int max = 0, sum = 0;
				double avg = 0.0;
				for(int i = 0; i < student.length; i++) {
					if(student[i] > max) {
						max = student[i];
					}
				}
				for(int j = 0; j < student.length; j++) {
					sum += student[j];
				}
				avg = (double)sum / student.length;
				System.out.println("최고 점수 : " + max + "\n평균점수 : " + avg);
			}else {
				flag = false;
			}
			
		}

	}

}
