package basic.ch23;

public class BankAccount {
	private int money = 100_000; // 공동 계좌의 전액

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money; //
	}
	// synchronized(동기화)
	// 코드를 순처적으로 흘러가게끔 해줌
	// 스레드 간섭, 메모리 불일치 오류를 막는 도구
	// 동시 접근 시 데이터가 섞이는 경우가 있어 이를 막을 수 있음
	// 공유 자원을 lock하여 다른 Thread 가 접근 못하게 제어함.(스레드가 다 돌아갈 때까지 기다리라는 의미)

	// 입금
	public synchronized void saveMoney(int money) { // synchronized 메서드
		// 현재 잔액은 10만원
		int currentMoney = getMoney(); // getMoney()(money 불러내는 메서드)를 currentMoney라고 부름

		// CPU가 빠르게 작동하기 때문에 Thread.sleep() 해야 함 + 예외처리
		try {
			Thread.sleep(3000); // 입금 하는데 걸리는 시간 = 3초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(currentMoney + money); // setMoney를 currentMoney(10만원) + money(입력한 값)임을 선언함. 
										//(즉, money 값을 초기화함.)
		System.out.println("입금 후 계좌 잔액 : " + getMoney()); // 초기화된 money(현재 금액)를 출력함.
	}

	// 출금
	public int withDraw(int money) {
		synchronized (this) { // synchronized 블록
			// 현재 잔액 10만원
			int currentMoney = getMoney();// getMoney()(money 불러내는 메서드)를 currentMoney라고 부름

			// CPU가 빠르게 작동하기 때문에 Thread.sleep() 해야 함 + 예외처리
			try {
				Thread.sleep(500); // 출금하는데 걸리는 시간 0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 방어적 코드 작성
			if (currentMoney >= money) { // 현재 금액이 입력한 money 보다 크거나 같으면
				setMoney(currentMoney - money); // setMoney는 currentMoney(10만원) + money(입력한 값)임을 선언함. 
												//(즉, money 값을 초기화함.)
				System.out.println("출금 후 계좌 잔액 : " + getMoney()); // 초기화된 money(현재 금액)를 출력함.
				return money; // 출금한 금액만큼 반환됨.(출금됨)
			} else { // 그게 아니면 => 현재 금액보다 입력한 값이 크다면
				System.out.println("계좌 잔액이 부족합니다.");
				return 0; // 잔액이 부족하여 0 원이 반환됨.
			}
		}
	}
}
