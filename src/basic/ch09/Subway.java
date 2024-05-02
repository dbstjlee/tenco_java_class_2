package basic.ch09;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int line) {
		lineNumber = line;
		
	}
	// 지하철도 승객을 태우다는 기능을 만듬.
	public void take(int pay) {
		money += pay;
		passengerCount++;
	}
	
	// 현재 상황을 보여주는 기능을 만듬. 
	public void showInfo() {
		System.out.println("지하철 번호 : " + lineNumber);
		System.out.println("지하철 승객수 : " + passengerCount);
		System.out.println("지하철 수익금 : " + money);
	}
}
