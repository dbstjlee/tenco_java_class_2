package basic.ch09;

public class Bus {

	// 버스의 기능, 속성을 생성자를 통해서 만듬.
	
	int busNumber;
	int passengerCount; // 승객 수
	int money;// 수익금
	
	// 기본생성자가 생성됨. 강제성을 주고 싶음.
	public Bus(int number) {
		// 객체 생성 시 제일 먼저 실행되는 부분
		busNumber = number;
	}
	
	// 승객을 태운다.
	//메서드를 설계하자
	public void take(int pay) {
		//money = money + pay;
		money += pay;
		//passengerCount += 1;
		passengerCount++;
	}
	// 현재 상황을 보여주는 기능을 만들어 보자.
	public void showInfo() {
		System.out.println("버스 번호 : " + busNumber);
		System.out.println("버스 승객수 : " + passengerCount);
		System.out.println("버스 수익금 : " + money);
	}
	
	
	
}
