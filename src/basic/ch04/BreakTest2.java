package basic.ch04;

public class BreakTest2 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 소수 7이면 반복문을 멈추어라
		// for 문 대신에 while 문으로 변경해서 작성하시오.
		int i = 1;
		while (i < 11) {

			// 단독 if 구문 - 수행이 될 수도 있고 안될 수도 있다.
			if (i % 7 == 0) {
				// 중간에 멈추어라
				break;
			}
			System.out.println(i);
			i++;
		}
	}// end of main
}// end of class
