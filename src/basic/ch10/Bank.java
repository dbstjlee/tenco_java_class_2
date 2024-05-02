package basic.ch10;

//은행
public class Bank {

	// 기본 생성자 없음
	// 아무것도 지정하지 않으면 default 제어 지시자이다.
	// private은 클래스 안에서만 사용이 가능하다.
	private String name;
	private int balance; // 정보 은닉 --> 외부에서는 확인 안되어야 하는 중요한 변수(데이터)를 감춘다.

	// 입금하다.
	public void deposit(int money) {
		balance = balance + money;
		showInfo();

	}

	// 출금하다.
	public int withdraw(int money) {
		// 방어적 코드를 작성
		if (balance < money) {
			System.out.println("잘못된 요청입니다.");
			return 0;
		}
		balance = balance - money;
		showInfo();
		return money; // 원하는 금액만 출금됨.
		// return balance -> 전액이 출금됨.
	}

	// 현재 은행의 총 잔액을 출력하다.
	public void showInfo() {
		System.out.println("현재 잔액은 : " + this.balance + "입니다.");
	}

	// 정보 은닉(private) 후에 getter, setter 메서드를 설계해 둘 수 있다. (사람들이 balance를 못 보기 때문)
	// get 메서드란 단순히 객체의 상태 변수를 리턴하는 메서드이다
	// balance만 리턴하고 싶음.
	// 정보은닉의 개념으로 필요시 getter나 setter 생성
	// 행동을 만드는 것
	public int getBalance() {
		return this.balance;
	}

	public String getName() {
		return this.name;
	}

	// 은행 2개를 합침(setter - 원래 덮어씀 ) -> 필요 없으면 안 만들어도 됨.
	// setter 멤버 변수에 접근해서 객체의 상태 값을 변경하게 하는 메서드(리턴 타입 없음)
	public void setName(String inputName) {
		this.name = inputName;
	}

	public void setBalance(int money) {
		// 방어적 코드 작성하기
		if (money < 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
			this.balance = money;
		}
	}

}
