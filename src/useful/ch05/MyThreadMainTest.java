package useful.ch05;

public class MyThreadMainTest {

	// 기본 적으로 메인 작업자 하나를 가지고 있다. 메인 쓰레드라 한다.
	public static void main(String[] args) {

		System.out.println(Thread.currentThread()); // static -> 객체 생성 없이 바로 쓸 수 있는 메서드

		// 필요하다면 추가 작업자를 사용할 수 있다.
		MyThread th1 = new MyThread(); // 객체를 메모리에 올림
		th1.start(); // th1 의 start() 메서드를 호출함. start 호출되면 run() 메서드가 동작되게 약속되어 있다.
		// System.out.println(th1.currentThread()); -> main 쓰레드가 실행
		System.out.println("-----------------------------------");

		// 필요하다면 추가 작업자를 더 만들 수 있다.
		MyThread th2 = new MyThread();
		th2.start();

		// 작업자 3개 만들어짐 (멀티 쓰레드)
		// 스케쥴러가 알아서 switch해서 결과가 섞여 보임

	}// end of main
}// end of class
