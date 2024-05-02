package basic.ch23;

public class BankAccount {

	private int money = 100_000; // 전액

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 입금
	public synchronized void saveMoney(int money) { // synchronized(동기화): 코드를 순처적으로 흘러가게끔 해줌
		// 스레드 다 돌아갈 때까지 기다려(lock)
		// synchronized 메서드 앞에 써서 synchronized 메서드라고 부름.

		// 현재 잔액 10만원...
		int currentMoney = getMoney();

		// 시간이 걸림
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		// 10만 + 1만 => 11만원 (5천원 이 사라짐)
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
	}

	// 출금
	public int withDraw(int money) {

		synchronized (this) {

			// 현재 잔액 10만원
			int currentMoney = getMoney();

			// 출금 0.5초 정도 시간이 걸림
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 방어적 코드 작성
			if (currentMoney >= money) {
				// 10만 - 5천 => 9만 5천
				setMoney(currentMoney - money);
				System.out.println("출금 후 계좌 잔액 : " + getMoney());
				return money;
			} else {
				System.out.println("계죄 잔액이 부족합니다.");
				return 0;
			}
		}
	}
}
