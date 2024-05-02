package basic.ch04;

public class WhileTest2_1 {

	public static void main(String[] args) {

		// 1부터 5까지 덧셈 연산을 하라
		// 1 + 2 + 3 + 4 + 5
		int start = 1; // 시작값은 1
		int end = 5; // 5번
		int sum = 0;

		// 첫번째 반복
		// 6번째
		// 6 <= 5 -> 거짓 --> 반복문 종료

		// 특정 조건식을 만들어서 반복문을 멈추게 해야한다.
		// 만약 start 값이 10일 때 종료하라
		boolean flag = true;
		while (flag) {
			if (start == 5) {
				// 실행에 제어권을 반납한다.
				flag = false;
				//return;
				// 끝없는 반복을 중지시키는 콘솔의 '빨간 버튼'이라고 생각하기
				// return을 안 쓰면 코드가 내려가서 while 문을 수행함.
				// 다시 올라가서 flag 조건 확인함.
			}

			// 1: 1 = 0 + 1 => sum : 1
			// 2: 1 + 2 => sum : 3
			// 3: 3 + 3 => sum : 6
			// 4: 6 + 4 => sum : 10
			// 5: 10 + 5 => sum : 15
			sum += start;
			System.out.println("sum(" + start + ") : " + sum);
			start++; // 1씩 증가
		}

	}

}
