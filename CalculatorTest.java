package day03;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.x = 150;
		cal.y = 30;
		
		System.out.println(Calculator.add(100, 80));
		cal.minus(120, 90);
		System.out.println(cal.multi());
		cal.div();
		
		// 정사각형 넓이 구하기
		double result = 10 * 10 * Calculator.pi;
		// 직사각형 넓이 구하기 
		double result2 = cal.areaRect(10, 20);
		
		System.out.println("정사각형의 넓이 : " + result + "\n직사각형의 넓이 : " + result2);
		

	}

}
