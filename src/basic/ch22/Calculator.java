package basic.ch22;

public abstract class Calculator implements Calc {

	// 구현한다 -> 인터페이스 -> 구현 메소드
	
	// 예상 테스트 값 n1 - 10 , n2 - 0
	@Override 
	public double divide(int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("어떤 수를 0으로 나눌 수 없습니다.");
			return 0.0; //리턴타입 double 의미 없는 값 0.0
			// 여기 코드까지 출돌 안 되고 내려옴.
		}
		return n1/n2;
	}

}
