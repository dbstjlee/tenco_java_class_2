package basic.ch01;

/**
 * 문자 데이터 타입
 * 
 * chat 자료형의 크기는 2byte 입니다.
 */

public class DataType2 {

	public static void main(String[] args) {

		// 기본 자료형 중 - 문자 타입(사실은 정수형)
		// 문자를 저장하기 위한 변수를 선언할 때 사용.
		// char 타임은 단, 하나의 문자만을 저장할 수 있다.

		char charBox;
		charBox = 'c'; // char 는 홑따옴표를 사용한다.
		System.out.println(charBox);

		// charBox = '가나'; -> 대입 불가

		// 참고 ! 두개 이상에 문자가 연속된 형태를(String) 문자열 --> 예시 : "안녕반가워"

		System.out.println("--------------------------------");
		System.out.println((int) charBox);

		// 도전 문제
		// 소문자 a, b, c 는 정수값으로 얼마일까?

		char Box;
		Box = 'a';
		System.out.println((int) Box);

	} // end of main

} // end of class
