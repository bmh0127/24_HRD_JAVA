package day05;

interface Soundable{
	public String sound();
}

class Dog implements Soundable{
	@Override
	public String sound() {
		return "멍멍";
	}
	
}

class Cat implements Soundable{
	@Override
	public String sound() {
		return "야옹";
		
	}
	
}

public class AnimalTest {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {

		AnimalTest at = new AnimalTest();
		at.printSound(new Dog());
		AnimalTest.printSound(new Cat());
	}

}

abstract class Animal{
	//	추상 클래스... 적어도 한개 이상의 추상 메소드를 갖는 클래스
	// 추상 메소드 : {}바디가 없는 메소드
	abstract void sound();
}
