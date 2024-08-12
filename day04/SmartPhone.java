package day04;

public class SmartPhone extends Phone {
	public boolean wifi;
	
	public SmartPhone(String model, String color) {
		super(model, color);	
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이를 연결합니다.");
	}
	public void internet() {
		System.out.println("인터넷을 연결합니다.");
	}

	@Override
	public void bell() {
		System.out.println("링딩동링딩동 벨소리가 울립니다.");
	}
	
	
}
