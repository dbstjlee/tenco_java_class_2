package basic.ch23;

public class MainTest {

	public static void main(String[] args) {
		// 현재 잔액 : 100_000
		BankAccount account = new BankAccount(); // 계좌 객체 생성

		// 생성자 의존 주입(DI)
		// 아버지 클래스 new
		Father father = new Father(account); // 아버지 객체 생성 및 기본 생성자의 매개변수에 계좌(account) 입력 
		father.start(); //  Father 클래스는 Thread 의 상속을 받고 있음 
		// -> Thread.start(); 는 새로운 작업자를 생성해서 run()을 수행하도록 위임함.
		// -> 새로운(다른) 작업자가 Father 클래스 내의 run() 메서드를 실행함.
		

		// 어머니 클래스 new
		Mother mother = new Mother(account);// 어머니 객체 생성 및 기본 생성자의 매개변수에 계좌(account) 입력 
		mother.start(); // Mother 클래스는 Thread 의 상속을 받고 있음 
		// -> Thread.start(); 는 새로운 작업자를 생성해서 run()을 수행하도록 위임함.
		// -> 새로운(다른) 작업자가 Mother 클래스 내의 run() 메서드를 실행함.

		int resultMoney = account.getMoney(); //BankAccount 타입의 getMoney()를 호출함으로써 계좌 전액을 불러낸 것을 resultMoney라고 함.
		System.out.println("현재 잔액 : " + resultMoney); // 코드 흐름 및 동기화에 의해 아버지가 먼저 입금을 끝낸 후에 어머니가 출금함.
		// 정상 처리 : 10만원 + 1만원 => 11만원 - 5천원 => 10만 5천원이 출력됨.
		// 10만원 출력 후 3초 뒤에 11만원 출력 후 0.3초 뒤에 10만 5천원 출력됨.
	}
}
