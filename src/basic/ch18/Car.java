package basic.ch18;


public class Car{
	
	String name;
	int price;
	Engine engine; // Composition 관계(포함관계, has-a 관계) (자동차 안에 엔진이 포함되어 있음)
	// 엔진 클래스를 자신의 필드(멤버변수)로 포함시킴/ 객체 안에 직접 객체를 생성함. 의존성, 강한 연결.
	// Null 오류 뜨는 이유: 객체를 생성하지 않았거나 변수의 객체의 주소값을 넣지 않았거나??
	
	public Car() { // 동작하기 위해 초기화 과정을 해야 함.
		// 포함관계
		// 객체 안에 필요한 객체를 직접 생성할 경우를 Composition 관계라고 함
		engine = new Engine();
		//Car라는 객체가 생성이 될 때 Engine 객체도 함께 생성이 된다. 
		// 자동차가 생성이 되어야 엔진이 생성됨.
	}
	
	public void startCar() {
		engine.strat();
		System.out.println("자동차가 출발 합니다.");
	}
	
	public void stopCar() {
		engine.stop();
		System.out.println("자동차가 멈춥니다.");
	}
	
	
	
}
