package basic.ch22;

interface Animal { // 클래스가 아닌 인터페이스임.
	// extends 는 단일 상속만 가능. interface는 다중 상속 가능함.
	
	// 추상 메서드만 선언 가능
	// public abstract void eat();
	// public abstract void move();

	// 축약 가능
	void eat();

	void move();

}

// 추상클래스가 되거나 add unimple~
class Dog implements Animal { // 상속 - extends 대신 구현하다는 의미의 implements 사용함.

	@Override
	public void eat() {
		System.out.println("먹이를 먹다");
	}

	@Override
	public void move() {
		System.out.println("촐랑촐랑 다닌다");
	}

}

class Bird implements Animal {

	@Override
	public void eat() {
		System.out.println("모이를 먹다");
	}

	@Override
	public void move() {
		System.out.println("날라 다니다");
	}

}