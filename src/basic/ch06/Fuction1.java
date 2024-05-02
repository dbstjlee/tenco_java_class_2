package basic.ch06;

public class Fuction1 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int sum;
		add(10, 10);
		System.out.println("------------------");
		int j = calcSum(7, 200);
		System.out.println(j);
	}// end of main

	static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return n1 + n2;
	}

	// 연습문제
	// 함수를 수정 -- 파라메터 정수 2개를 받을 수 있도록 설계
	// s1, s2 --> 
	// 1, 10 --> 55 
	// 7, 200 --> 7 + 8 + 9 +... 
	// 7, 10 --> 7+8+9+10
	static int calcSum(int s1, int s2) {
		int sum = 0;
		int i;
		for (i = s1; i <= s2; i++) { // s1이 s2 만큼 동작함.
			sum = sum + i; // (1,100) -> 5050 (1+2+3+...+100)
		}
		return sum;
	}

}// end of class
