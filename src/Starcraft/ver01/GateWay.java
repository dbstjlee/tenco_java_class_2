package Starcraft.ver01;

public class GateWay {
	
	private int gateWayNumber;
	private int count;
	
	
	// 생성자
	public GateWay(int gateWayNumber) {
		this.gateWayNumber = gateWayNumber;
		count = 0;
	}


	public int getCount() {
		return count;
	}
	public int gateWayNumber() {
		return gateWayNumber;
	}
	//기능 - 질럿을 생산하는 기능을 만들어 보세요.
	public Zealot createZealot(String name) {
		count++;
		return new Zealot(name);
	}
	

}
