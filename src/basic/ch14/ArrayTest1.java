package basic.ch14;

public class ArrayTest1 {
	public static void main(String[] args) {

		// 배열이란?(자료구조의 한 부분임)
		// 연관된 데이터를 모아서 통으로 관리하기 위한 데이터 타입!!

		// 배열의 특징(중요)
		// 배열은 사용하기 전에 반드시 몇 개의 데이터가 들어갈지
		// 크기를 지정해야 사용할 수 있다.

		// 배열 메모리 공간 만들기
		int[] numbers = new int[3]; // -> 공간만 선언한 것이고 값을 넣은 것이 아님.
		int intBoxes[] = new int[5];

		// 값 넣기(초기화)
		// numbers의 배열의 길이 = 3
		// index 의 길이 = 2
		numbers[0] = 1000;
		numbers[1] = 1001;
		numbers[2] = 1002;

		// numbers[3] = 1003; //-> 인덱스의 길이를 벗어났음. 없는데 값을 넣어서 오류 발생.
		// 사전기반지식 - 모든 프로그래밍의 인덱스 번호의 시작은 0부터 시작한다.

		// 배열의 선언과 동시에 초기화
		int[] grades = new int[] { 5, 3, 1 }; // -> 배열의 크기는 3개임. 인덱스의 크기는 2개(0,1,2)임.
		int[] grades2 = { 5, 3, 1 }; // new int[]도 생략 가능하다.

		// 문제 1
		// 5개의 크기를 가지는 double 타입의 배열을 선언하시오.
		// 단, 배열의 이름은 마음대로 작성하세요.

		double[] numBox = new double[5]; // -> [] [] [] [] [] 공간만 형성함.
		// -> double이라는 데이터 타입을 저장할 수 있는 배열임

		// 문제2
		// 위에서 선언한 배열의 값을 인덱스 0 ~ 2까지 초기화 하시오.
		// 값은 아무거나 상관 없음.

		numBox[0] = 10.0;
		numBox[1] = 0.5;
		numBox[2] = 1.3;
		// numbox[3] = 0.0; // 값을 초기화 안 하면 자동으로 0.0으로 입력?됨.
		// numbox[4] = 0.0;

		// 문제3
		// String 타입의 배열을 선언, 배열의 크기는 3개,
		// 선언과 동시에 초기화 하세요.

		String[] name = new String[] { "A", "B", "C" };
		// String[] name = {"A", "B", "C"};

	}// end of main
}// end of class
