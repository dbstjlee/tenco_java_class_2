package useful.ch05;

// How, Why

public class Worker extends Thread {

	private String name;

	public Worker(String name) {
		this.name = name;
	}

	// 약속된 부분 --> run() 메서드를 정의하면 된다.

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker : " + name + " : " + i);

			try {
				Thread.sleep(200); // CPU가 빨리 작동해서 0.2초 정도 잠들어라
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
