package basic.ch23;

public class Father extends Thread {

	BankAccount account; // BankAccount 타입의 계좌(account)를 선언함

	// 객체가 될 때 맨 처음 등장하는 코드는 생성자이다.
	public Father(BankAccount account) {
		this.account = account; // 이 아버지 클래스의 계좌에 입력할 계좌(account)를 선언함.
	}

	@Override
	public void run() {
		// 1만원 입금 처리 - 다른 작업자에게 위임함.
		account.saveMoney(10_000); 
		// Father의 계좌에 BankAccount 의 saveMoney() 메서드가 호출되어 currentMoney(100_000) + 입력한 금액(10_000)이 됨.
	}
}
