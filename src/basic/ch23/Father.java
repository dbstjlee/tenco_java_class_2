package basic.ch23;

public class Father extends Thread {

	BankAccount account;
	// BankAccount account = new BankAccount;
	// 위임 시킬 일을 정의할 예정

	public Father(BankAccount account) {
		// 객체가 될 때 맨 처음 등장하는 코드는 생성자이다.
		this.account = account;
	}

	@Override
	public void run() {
		// 1만원 입금 처리 - 다른 작업자에세 위임함.
		account.saveMoney(10_000);
	}

}
