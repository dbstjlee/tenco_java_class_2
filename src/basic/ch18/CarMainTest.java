package basic.ch18;

public class CarMainTest {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.startCar();
		
		// 외부에서 엔진의 이름을 지정하고 싶다면?
		// 엔진의 속성인 name 변수의 값을 초기화해보자.
		car1.engine.name = "V8";  //참조타입 - . 연산자로 접근 // 엔진의 이름
		car1.engine.price = 4000; //엔진의 가격
		
		System.out.println(car1.engine.name);
		System.out.println(car1.engine.price);
		
		
	}

}
