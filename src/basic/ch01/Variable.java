package basic.ch01;

/**
 * <- 여러줄 주석
 * 변수란 뭘까?
 * 변하는 수(변할 수 있는 데이터)
 * 데이터(값)를 담을 수 있는 메모리 공간(상자)
 */
public class Variable {
	
	// 코드의 시작점(메인 함수)
	public static void main(String[] args) {	
		
		//변수를 활용하는 3가지 유형
		// int <-- 예약어, 다음 단계에서 자세한 설명을 합니다. 
		// 1. 변수를 선언, 2. 변수에 값을 대입, 3. 변수에 접근해서 사용(이름이 필요)
		
		//1. 변수를 선언
		int ageBox; // 정수값을 담을 수 있는 상자를 선언
		int telBox; // 정수값을 담을 수 있는 상자를 선언
		
		// 2. 변수에 값을 넣기
		ageBox = 30;
		telBox = 300;
		
		//3. 변수를 사용하기
		System.out.println(ageBox);
		ageBox = 30;
		System.out.println("after ---> ageBox : " + ageBox);
		System.out.println("-------------");
		System.out.println();
		

	} // end of main

} // end of class
