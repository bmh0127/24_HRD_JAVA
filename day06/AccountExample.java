package day06;

class Account{
	
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	// 예금하기
	public void depositint(int money) {
		balance += money;
	}
	
	// 출금하기
	public void withdraw(int money) throws InsufficientException {
		if(balance < money) {
			throw new InsufficientException("잔고 부족 : " + (money - balance) + "원 모자람");
		}
		balance -= money;
	}
	
}

public class AccountExample {

	public static void main(String[] args) {
		
		Account ac = new Account();
		
		ac.depositint(10000);
		System.out.println("예금액 : " + ac.getBalance());
		
		// 출금하기
		try {
			ac.withdraw(30000);
		}catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}

	}

}
