package basic.ch02;

public class RectangleAreaCalculator {

	public static void main(String[] args) {

		//가로 길이, 세로 길이, 단 상수 사용
		// 식을 작성하고 
		final int WIDTH = 10;
		final int HEIGHT = 5;
		
		int area = WIDTH * HEIGHT;
		
		//결과 출력하기
		System.out.println("사각형의 면적 :" + area);
		//문자열은 특별한 녀석임. 연산을 사용할 수 있음.
		//문자열 + 정수, 문자열 + 실수.....
		//위 연산에 결과 값은 ----> 문자열 리턴 된다.
	}

}
