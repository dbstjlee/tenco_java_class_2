package basic.ch04;

public class WhileTest3 {

	public static void main(String[] args) {
		// 연습문제
		// 1부터 10까지 덧셈의 연산을 콘솔창에 출력하시오. 단 while 구문 작성
		int start = 1;
		int result = 0;
		while (start <= 10) {
			result += start;
			start++;
			// 1 = 0 + 1
			// 3 = 1 + 2
			// 6 = 3 + 3
			// 10 = 6 + 4
			// 15 = 10 + 5
			// 21 = 15 + 6
			// 28 = 21 + 7
			// 36 = 28 + 8
			// 45 = 36 + 9
			// 55 = 45 +10
		}
		System.out.println(result);
		//while 반복이 끝나면 while 구문 밖에서 출력됨. 
	}
}
