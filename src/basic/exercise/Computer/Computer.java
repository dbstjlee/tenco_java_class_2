package basic.exercise.Computer;

public abstract class Computer { // 휘어진 글씨 = 추상적 --> 추상 클래스 입력

	public abstract void display();// 추상 메서드는 abstract + 메서드의 선언부분만 존재

	public abstract void typing();

	public void turnOn() {
		System.out.println("컴퓨터의 전원이 켜집니다.");
	}

	public void trunOff() {
		System.out.println("컴퓨터의 전원이 꺼집니다.");
	}

}
