package basic.ch10;

public class BankTest {

	// 코드의 시작점
	public static void main(String[] args) {

		Bank bank1 = new Bank();
		// bank1.name = "우리은행"; // 필드 = 멤버변수
		bank1.deposit(10_000);
		int getMoney = bank1.withdraw(5_000); // 리턴타입 -> int
		System.out.println(">>>>>>> 출금 >>>>>>>>");
		System.out.println("금액 : " + getMoney);

		// 신입 개발자가 실수로 멤버 변수에 접근해서 수정..
		// Bank에 돈을 넣어야 할 때 ㅑㄹ -->deposit() 기능으로 만들어져 있다.
		// bank1.balance = 100_000; <--- private으로 변경 후에 정보은닉 되었다.
		// 10만 5천원이 있어야 정상임.
		// 의도하지 않은 실수를 발생 시킬 수 있다.
		bank1.deposit(100_000);
		// bank1.showInfo();
		// 덮어쓰기가 되어버림.

		// 실행의 흐름을 만들 예정
		// 현재 은행의 전체 잔고가 20_000 이하라면 본점에 금액을 요청해야 하는 상황일 때...
		System.out.println(bank1.getBalance());
		int money = bank1.getBalance();
		if (money <= 200_000) {
			System.out.println("본점에 금액을 요청해");
		}
		System.out.println("---------------");
		bank1.setName("그린은행");
		System.out.println(bank1.getName());

		bank1.setBalance(-1000_000);
		System.out.println(bank1.getBalance());
		bank1.withdraw(5_000);
	}// end of main

}// end of class
