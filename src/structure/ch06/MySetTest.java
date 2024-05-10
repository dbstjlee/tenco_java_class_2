package structure.ch06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MySetTest {

	public static void main(String[] args) {

		// 계층 구조 확인
		// 업캐스팅 상태 - 컴파일 시점에는 Set 계열의 타입은 멤버들만 확인 가능
		Set<Integer> mSet = new HashSet<Integer>(); // 인터페이스는 new 불가능함

		HashSet<Integer> set1 = new HashSet<Integer>(); // 업캐스팅 상태 아님.

		// 요소 추가 방법
		set1.add(1);
		set1.add(1); // 중복값 발생
		set1.add(2);
		set1.add(3);
		set1.add(3); // 중복값 발생

		System.out.println(set1.size()); // 사이즈 확인

		// 요소 제거(요소 -> 값을 넣음)
		set1.remove(3); // 3을 제거하라
		System.out.println(set1); // set1 내부에 정의된 toString 값이 나옴.

		// set 계열은 순서를 보장하지 않음
		for (int i = 0; i < set1.size(); i++) {
			// 횟수 만큼 반복은 한다.
			// set1[i]. => set 계열은 인덱스 개념이 없다.
		}
		// foreach를 통해 for 활용
		for (Integer mI : set1) { // set1에 정수값 들어가있다고 보장되어 있음.
			System.out.println("요소 값 추출" + mI);
		}

		System.out.println("------------------------------");
		// 반복자(iterator)를 활용해서 요소 순회를 할 수 있다.

		Iterator<Integer> iter = set1.iterator(); // 데이터 타입이 달라서 형변환하기
		// set1.iterator() -> 내부적으로 알아서 바꿔줌.

		while (iter.hasNext()) {
			System.out.println("값 확인 : " + iter.next());

		}

		System.out.println("-------------------------------");

		// getRandomNumber() 메서드가 호출되면 데이터를 관리하고자 한다.
		HashSet<Integer> lottoNumbers = new HashSet<Integer>();

		int whileCount = 0;
		while (lottoNumbers.size() < 6) {
			lottoNumbers.add(getRandomNumber());
			whileCount++;
		}

		System.out.println(lottoNumbers);
		System.out.println("반복 횟수 : " + whileCount);

	} // end of main

	public static int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(45) + 1;
	}

} // end of class
