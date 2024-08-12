package day03;

public class CarExam {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.company = "현대";
		myCar.model = "제네시스";
		myCar.color = "회색";
		myCar.maxSpeed = 200;
		
		myCar.CarInfo();
		
		Car myCar2 = new Car("기아", "K7", "검정", 180);
		
		myCar2.CarInfo();
		

	}

}
