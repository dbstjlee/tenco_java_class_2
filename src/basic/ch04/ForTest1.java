package basic.ch04;

public class ForTest1 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 문제 - 화면에 0부터 9까지 화면에 출력하시오.
//		System.out.println("0");
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("5");
//		System.out.println("6");
//		System.out.println("7");
//		System.out.println("8");
//		System.out.println("9");

		// 반복적인 패턴이 보인다면 반복문(for)을 생각하자.
		// 초기화식이 0이라면 0 ~ 9까지 출력됨.
//		int i;
//		for(i = 0; i < 10; i++) {
		for (int i = 0; i < 10; i++) {
			// 반복적인 패턴의 구문을 작성한다.
			// i = 0;
			// int는 for구문 안까지만 적용됨.
			System.out.println(i);

		} // end of for

	}// end of main

}// end of class
