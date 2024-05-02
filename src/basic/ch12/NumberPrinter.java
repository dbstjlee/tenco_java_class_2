package basic.ch12;

// 번호 뽑아 주는 기계
public class NumberPrinter {
	
	private int id;
	// private int waitNumber; 멤버 변수
	// static 변수 --> Method Area
	// waitNumber 먼저 올라감
	public static int waitNumber; 
	
	public NumberPrinter(int id) {
		this.id = id;
		waitNumber = 1;
	}
	
	// 기능 -- 번호표를 출력한다.
	public void printWaitNumber() {
		
		System.out.println(id + "번에 기기의 대기 순번은 " + waitNumber);
		waitNumber++;
	}

}
