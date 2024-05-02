package basic.ch17;

public class Cal {
	
	
	public Cal() {
		System.out.println("Cal() 부모 생성자 호출");
	}

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int multiply(int n1, int n2) {
		System.out.println("2. 호출");
		System.out.println("여기는 부모 클래스 메서드 입니다.");
		return n1 * n2;
	}

	// 코드 테스트
	public static void main(String[] args) {
		Cal2 cal2 = new Cal2(); // new 메모리에 자식(cal2)만 올림 // heap 메모리에 먼저 부모 클래스가 태어난 후 자동으로 자식이 올라옴.
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.minus(10, 3));
		System.out.println(cal2.multiply(10, 0));
	}
}

class Cal2 extends Cal {
	
	public Cal2() {
		System.out.println("Cal2() 자식 생성자 호출");
	}

	public int minus(int n1, int n2) {
		return n1 - n2;
	}
//
//	// 부모 코드의 기능을 변경하고 싶다면 --> 재정의 하고 싶다면
//	// (부모의 메서드를 자식이 재정의함으로써 덮어씀-오버라이드)
//	// 오버라이드 처리 한다.
//	public int multiply(int n1, int n2) {
//		// a 또는 b --> 논리 연산자 --> 논리 합(||) --> 둘중에 하나라도 true라면 --> true이다.
//		// a 그리고 b --> 논리 연산자 --> 논리 곱(&&) --> 전부 true 여야 --> true이다.
//		if (n1 == 0 || n2 == 0) { // 둘 중에 하나라도 0이면
//			System.out.println("0을 입력하지 마시오.");
//		}
//		return n1 * n2;
//	}

	@Override // <- 오버라이드된 메서드다 // 애노테이션, 어노테이션 (주석 + 힌트)
	public int multiply(int n1, int n2) {
		System.out.println("1. 호출");
		return super.multiply(n1, n2); //this 대신에 super.(부모 클래스의 객체)로 부모의 메서드를 호출함
	}
	
	
	
	
}
