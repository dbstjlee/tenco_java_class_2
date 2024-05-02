package basic.ch03;

/**
 * 빠른 평가란?
 * 논리 연산에 있어 첫 번째 조건이 결과를 결정할 때
 * 두 번째 조건을 평가하지 않는 것을 의미한다.
 * 
 */
public class Operation7 {

	public static void main(String[] args) {

		int number = 5;
		int index = 0;
		
		//빠른 평가가 동작하는 식을 만들어 보자.
		//       F                          F           &&                T
		//                    15                  < 10           2                < 10
		boolean result = ( (number = number + 10) < 10 ) && ( (index = index + 2) < 10);
		System.out.println("현재 number 변수에 값은 : " + number);
		System.out.println("현재 index 변수에 값은 : " + index);
		// 하나라도 false 면 false 인데 number 가 false 여서 index 값은 볼 필요 없음.(무시함)
		// index 는 원래 0이어서 2 값을 무시하고 0으로 출력됨.
		System.out.println("==================");
		
		//number 값 재설정
		number = 5;
		//논리합을 이용한 빠른 평가 식을 만들어 보자.
		//    T               F         ||             T
		//                  15    < 10   ||        2       < 10
		result = ( (number += 10) < 10 ) || ( (index += 2) < 10 );
		
		// 문제
		System.out.println("number: " + number);
		System.out.println("index : " + index);
		// 하나라도 true 면 true 인데 뒤에 index가 true 라서 number, index 값 전부 봄. 
		
		System.out.println("==================");
		//도전 문제 
		//number 와 index 반대로 변경해서 출력해보자.
		
		number = 5;
		index = 0;
		// T?               T          ||              F
		//               2      < 10   ||        15        < 10
		result = ( (index += 2) < 10 ) || ( (number += 10) < 10 );
		System.out.println("index : " + index);
		System.out.println("number: " + number);
		//하나라도 true 면 true 인데 index는 2가 맞고 뒤에 number는 원래 5여서 5임.
		
		
	}// end of main

}// end of class
