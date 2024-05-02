package basic.ch16;

/**
 * 메서드 오버로딩이란? 같은 이름의 메서드를 여러 개 정의하는 것을 말한다.
 */
public class Calculator {

	// 덧셈 메서드 생성

	public int add(int a, int b) {
		return a + b;

	}

	public double add(double a, double b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	//문자열 더하는 기능
	public String add(String str1, String str2) {
		return str1 + str2;
	}

	
	
	


}
