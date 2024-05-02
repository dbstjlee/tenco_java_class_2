package useful.ch05;

/**
 * 쓰레드를 추가하는 방법 - 상속을 활용할 수 있다. 
 * Thread --> Runnable --> run()
 */
public class MyThread extends Thread { // java.lag = 자동으로 추가?되서 선언할 필요 없음.

	// 우리가 정의한 클래스에서 run() 메서드 재정의할 수 있다.
	// 쓰레드를 사용할 때 알아야 하는 필수 개념 - 외우자
	// 쓰레드가 가지고 있는 메서드 start() 호출 시키면 약속으로 run() 메서드가 호출되어 동작하게 만들어져 있다.

	@Override
	public void run() {
		// 우리가 동작 시키고자 하는 일을 정의해서 코드를 설계할 수 있다.
		// 임무 -> 반복문 200번을 수행해
		for (int i = 0; i < 200; i++) {
			System.out.print(i + " , "); // print(가로) println(세로) // \t : 띄어쓰기
			try {
				Thread.sleep(500); // 잠깐 잠들어 있어라. // millis = 1000 = 1초, 500 = 0.5초 // 예외처리 해달라고 오류 뜸
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// for문 1개, for문 1개, 쓰레드 3개 -> 계속 돌아감. 다 돌아가면 알아서 멈춤.
	} // end of main
}// end of class
