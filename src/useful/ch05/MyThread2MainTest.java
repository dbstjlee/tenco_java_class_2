package useful.ch05;

public class MyThread2MainTest {

	// 메인 작업자 하나
	public static void main(String[] args) {

		// 문제 MyThread2를 메모리에 올리고 그 안에 정의된 run() 메서드를 호출하시오.
		// 힌트 --> Thread 문서를 반드시 확인하시오.

		System.out.println("main Start");
		// System.out.println(Thread.currentThread());

		// Thread thread = new Thread();
		// myThread2.run(); // run() 메서드만 호출함.

		Thread Thread = new Thread(new MyThread2()); // MyThread2 안에 run() 메서드가 존재함
		// new Thread() = 생성자 -> 객체를 생성 가능
		// Thread 메서드 -> Runnable 참조 타입이 있음 = MyThread2 와 동일(다형성)

		// 암기 !!!! 새로운 작업자를 생성해서 위임 시킬 때는 Thread 안에 있는 start() 메서드를 호출해야 한다.
		Thread.start();

		// start() -> 새로운(다른) 작업자가 run()을 수행함.// 쓰레드에게 일을 위임하는 명령어
		// 다른 작업자에게 일을 위임하려면 쓰레드에 start()메서드를 호출해야 함.

		System.out.println("-------- end main Thread --------"); // 제일 마지막에 생성됨
		// 메모리 띄우고 run() 호출함 = 단일 쓰레드를 호출한 거임.
		// 멀티 쓰레드 시 제일 처음에 출력됨.

		// Runnable --> CPU에게 잡혀서 작업을 수행함.
	}
}
