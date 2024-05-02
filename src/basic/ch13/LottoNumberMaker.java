package basic.ch13;

import java.util.Arrays;
import java.util.Random; //가지고 오다. 수입하다.

public class LottoNumberMaker {

	// 멤버 변수
	private String version = "1.0.0"; // 메이저(맨처음), 마이너(중간) 버전

	// main 함수
	public static void main(String[] args) {

		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");

		int[] lottos = makeNumbers();
		Arrays.sort(lottos);
		for (int i = 0; i < lottos.length; i++) {
			System.out.println(lottos[i] + "\t");
		}

	}// end of main

	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		// static 함수 안에 멤버 변수를 사용할 수 없다.
		// 객체가 메모리로 올라가야 멤버 변수 쓸 수 있음
		// 메모리가 뜨는 순서!!(static은 M.A에 먼저 선언이 되어 잇어서)
		// System.out.println("ver : " + version);
		// 자바 도구 --> 표준 API
		// 난수 발생기 -> 랜덤적인 값 생성
		Random random = new Random();
		int resultNumber = random.nextInt(45) + 1; // 0~44 -> 1~45 랜덤값을 변수에 저정
		return resultNumber;

	}

	// 인스턴스에 속하지 않는 함수 만들기
	public static int[] makeNumbers() {
		int[] numbers = new int[6];
		Random random = new Random();
		// 이중 for문을 활용해서 중복된 숫자가 없도록 코드를 완성하시오.
		// 첫번째가 3이 나왔는데 두번째는 5, 3번째 3이 나오면 다시 두번째로 돌아가서 해야 함.
		// 0 --> 33
		// 1 --> 33
		for (int i = 0; i < 6; i++) {
			int num = random.nextInt(45) + 1;
			// j = 0, 0 < 0 <-- 동작 안함
			for (int j = 0; j < i; j++) {
				// j --> 0, i --> 1
				if (numbers[i] == numbers[j]) {
					// number[0] --> 33을 가리키고 있음.
					i--;
					break;
				}
			}
		}
		return numbers;
	}

}
