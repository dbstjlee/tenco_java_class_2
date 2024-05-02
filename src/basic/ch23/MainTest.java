package basic.ch23;

public class MainTest {

	public static void main(String[] args) {
		// 현재 잔액 : 100_000
		BankAccount account = new BankAccount();

		// 생성자 의존 주입(DI)
		// 아버지 클래스 new
		Father father = new Father(account);
		father.start();

		// 어머니 클래스 new
		Mother mother = new Mother(account);
		mother.start();

		int resultMoney = account.getMoney();
		System.out.println("현재 잔액 : " + resultMoney);
		// 정상 처리 : 10만원 + 1만원 - 5천원 => 10만 5천원
	}
}
