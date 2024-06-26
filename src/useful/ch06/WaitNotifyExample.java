package useful.ch06;

import java.util.ArrayList;

// 프로듀서-컨슈머 패턴
public class WaitNotifyExample {
	// 객체들간에 공유하는 데이터(자원)을 설계
	// static 이기 때문에 인스턴스들이 자원을 공유한다.
	private static ArrayList<Integer> sharedResoure = new ArrayList<>();
	// static => heap 메모리에 올라가기 전에 먼저 생성(Method Area에)
	private static boolean isDataAvailable = false;

	// 정적 내부 클래스 활용 - 생산자 만들어 보기
	static class Producer extends Thread {

		@Override
		public void run() {
			synchronized (sharedResoure) { // sharedResoure만 관리할꺼라고 선언함.
				System.out.println("생산자는 data 생성 시작 ~");
				for (int i = 0; i < 10; i++) {
					sharedResoure.add(i + 1);
					// sharedResoure : 여러 Array들이 접근할 수 있는 인스턴스
					System.out.print("."); // . 이 10개(1 ~ 10까지 반복) 찍힘
					try {
						Thread.sleep(1000); // 1초에 . 이 1개씩 생성
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} 
				System.out.println(); 
				// 작업이 다 끝나면 상태 변경 처리
				isDataAvailable = true;
				// sharedResoure를 쓸 수 있도록 다른 작업자들에게 알려주기(notify)
				sharedResoure.notify();
			} // 동기화 블록
		}
	}

	// 소비자 만들어 보기(정적 내부 클래스)
	static class Consumer extends Thread {

		@Override
		public void run() {
			synchronized (sharedResoure) {
				// isDataAvailable의 기본값: false
				// false -> !(부정) -> true -> 반복문이 수행됨
				while (!isDataAvailable) { // isDataAvailable가 true면 코드 실행
					System.out.println("고객은 데이터 생성까지 기다려..."); // 소비자가 스레드가 먼저 시작
					try {
						sharedResoure.wait(); // 대기 상태로 만듦 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				// sharedResoure.notify(); => 알림이 오면 while문(대기상태)이 멈추게 됨.
				// isDataAvailable = true로 바껴서 수행됨. <-- 생산자가 변수를 변경해줌
				System.out.println("데이터가 생성 완료 되어서 사용 가능함.");
				System.out.println(sharedResoure);

			} // 동기화 블록
		}
	}

	// 테스트 코드
	public static void main(String[] args) {

		Consumer consumer = new Consumer();
		Producer producer = new Producer();

		// 소비자 스레드 시작
		consumer.start(); // 소비자는 안의 run() 호출 -> 동기화 블럭 -> wait(스레드 대기)

		try {
			Thread.sleep(100); //0.1초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		producer.start(); // 생산자가 스레드 시작
		// run() -> for (10번) -> list add() (10번(1 ~ 10)) -> notify() 통해 알려주고 있다.
		
		// 이후 consumer.wait(); 및의 구문이 출력됨.
		// sharedResoure 출력 시 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]가 나옴.(데이터 타입이 Integer)
		
	}// end of main
}// end of class
