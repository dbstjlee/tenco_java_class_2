package basic.ch13;

public class LottoGame3 {

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

		// 오름차순으로 정렬해보기
		// 만약 1상자가 2상자 보다 크다면 어떤 행동을 하라
		// 1상자가 2상자 보다 먼저 출력되게....

		int tempBox = 0;

		// 반복횟수 6번
		for (int pass = 1; pass <= 6; pass++) {
			if (pass > gameNumber2) {
				tempBox = gameNumber1;
				gameNumber1 = gameNumber2;
				gameNumber2 = tempBox;
			}

			if (gameNumber1 > gameNumber2) {
				tempBox = gameNumber1;
				gameNumber1 = gameNumber2;
				gameNumber2 = tempBox;
			}
			if (gameNumber2 > gameNumber3) {
				tempBox = gameNumber2;
				gameNumber2 = gameNumber3;
				gameNumber3 = tempBox;
			}
			if (gameNumber3 > gameNumber4) {
				tempBox = gameNumber3;
				gameNumber3 = gameNumber4;
				gameNumber4 = tempBox;
			}
			if (gameNumber4 > gameNumber5) {
				tempBox = gameNumber4;
				gameNumber4 = gameNumber5;
				gameNumber5 = tempBox;
			}
			if (gameNumber5 > gameNumber6) {
				tempBox = gameNumber5;
				gameNumber5 = gameNumber6;
				gameNumber6 = tempBox;
			}
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
		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");

	}// end of main

}
