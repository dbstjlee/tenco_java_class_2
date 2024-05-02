package basic.ch13;

public class LottoGame {

	public static void main(String[] args) {

		// static 변수 --> 클래스 변수라고도 불린다.
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		// 전체 1~6까지 나온 결과값을 오름차순으로 정렬
		// 단, 중복값 제외

		// 수식을 작성해주세요.
		// 만약 if --> 반복문 사용 금지 if 문 6개로 구성해주세요

		// 반복문을 작성하면??

		int tempBox = 0;
		for (int i = 1; i <= 6; i++) {
			// 5 1 9 7 2 3
			if (gameNumber1 > gameNumber2) {
				tempBox = gameNumber1;
				gameNumber1 = gameNumber2;
				gameNumber2 = tempBox;
			} // if가 true여서 조건문이 수행됨. 1과 2의 위치를 바꿈
				// 1 5 9 7 2 3
			if (gameNumber2 > gameNumber3) {
				tempBox = gameNumber2;
				gameNumber2 = gameNumber3;
				gameNumber3 = tempBox;
			}
			// 1 5 9 7 2 3
			if (gameNumber3 > gameNumber4) {
				tempBox = gameNumber3;
				gameNumber3 = gameNumber4;
				gameNumber4 = tempBox;
			}
			// 1 5 7 9 2 3
			if (gameNumber4 > gameNumber5) {
				tempBox = gameNumber4;
				gameNumber4 = gameNumber5;
				gameNumber5 = tempBox;
			}
			// 1 5 7 2 9 3
			if (gameNumber5 > gameNumber6) {
				tempBox = gameNumber5;
				gameNumber5 = gameNumber6;
				gameNumber6 = tempBox;
			}
			// 1 5 7 2 3 9
			if (gameNumber1 > gameNumber3) {
				tempBox = gameNumber1;
				gameNumber1 = gameNumber3;
				gameNumber3 = tempBox;
			}
			if (gameNumber1 > gameNumber4) {
				tempBox = gameNumber1;
				gameNumber1 = gameNumber4;
				gameNumber4 = tempBox;
			}
			if (gameNumber1 > gameNumber5) {
				tempBox = gameNumber1;
				gameNumber1 = gameNumber5;
				gameNumber5 = tempBox;
			}
			if (gameNumber1 > gameNumber6) {
				tempBox = gameNumber1;
				gameNumber1 = gameNumber6;
				gameNumber6 = tempBox;
			}
			if (gameNumber2 > gameNumber4) {
				tempBox = gameNumber2;
				gameNumber2 = gameNumber4;
				gameNumber4 = tempBox;
			}
			if (gameNumber2 > gameNumber5) {
				tempBox = gameNumber2;
				gameNumber2 = gameNumber5;
				gameNumber5 = tempBox;
			}
			if (gameNumber2 > gameNumber6) {
				tempBox = gameNumber2;
				gameNumber2 = gameNumber6;
				gameNumber6 = tempBox;
			}
			if (gameNumber3 > gameNumber5) {
				tempBox = gameNumber3;
				gameNumber3 = gameNumber5;
				gameNumber5 = tempBox;
			}
			if (gameNumber3 > gameNumber6) {
				tempBox = gameNumber3;
				gameNumber3 = gameNumber6;
				gameNumber6 = tempBox;
			}
			if (gameNumber4 > gameNumber6) {
				tempBox = gameNumber4;
				gameNumber4 = gameNumber6;
				gameNumber6 = tempBox;
			}
		}

		// double 정렬 방식이라고 함.(경우의 수 전부 생각하기)

		// 중복값은..? 만약 중복이 아니면 출력되게..? 아직을 이 문제를 해결할 수 없음.
		// if가 적용되는 것도 있고 적용되지 않은 것도 있음.

		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");

		// 오름차순으로 정렬해보기
		// 만약 1상자가 2상자 보다 크다면 어떤 행동을 하라
		// 1상자가 2상자 보다 먼저 출력되게....

		// 예상 1box = 5, 2box = 3;

//		if(gameNumber1 > gameNumber2) {
//			// 0 = 3 -> temp = 3
//			tempBox = gameNumber1;
//			// 3
//			gameNumber1 = gameNumber2;
//			// 5
//			gameNumber2 = tempBox;
//		}
		// System.out.println("-------------------");
		// 정렬 --> 3, 5
//		System.out.println(gameNumber1);
//		System.out.println(gameNumber2);

	}// end of main
}