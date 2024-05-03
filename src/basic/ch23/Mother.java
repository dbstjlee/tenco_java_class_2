package basic.ch23;

public class Mother extends Thread {

	BankAccount account; // BankAccount 타입의 계좌(account)를 선언함

	public Mother(BankAccount account) {
		this.account = account; // 이 엄마 클래스의 계좌에 입력할 계좌(account)를 넣음
	}

	@Override
	public void run() {
		// 5천원 출금 요청 - 다른 작업자
		account.withDraw(5_000);
		// Mother의 계좌에 BankAccount 의 withMoney() 메서드가 호출되어 currentMoney(100_000) - 입력한 금액(5_000)이 됨.
	}
}