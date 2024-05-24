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
		// set은 중복 허용X

		System.out.println(set1.size()); // set1.size(): 3

		// 요소 제거
		set1.remove(3); // 3이 제거됨.
		// set1.size(): 2
		System.out.println(set1); // set1 내부에 정의된 toString 값이 나옴.
		// 출력: [1, 2]

		// set 계열은 순서를 보장하지 않음
		for (int i = 0; i < set1.size(); i++) {
			// 횟수 만큼 반복은 한다. //0, 1
			// set1[i]. => set 계열은 인덱스 개념이 없다.
		}
		// foreach를 통해 for 활용
		for (Integer mI : set1) { // set1에 정수값 들어가있다고 보장되어 있음.
			// set1: hashmap 자료구조의 배열이 담겨 있는 변수
			// Integer mI : set1 배열의 각 요소 값을 순차적으로 mI에게 전달
			System.out.println("요소 값 추출 : " + mI);
			// 출력: 요소 값 추출 : 1
			// 출력: 요소 값 추출 : 2
		}
		System.out.println("------------------------------");

		// 반복자(iterator)를 활용해서 요소 순회를 할 수 있다.
		Iterator<Integer> iter = set1.iterator(); // 데이터 타입이 다름 -> 형변환하기
		// set1.iterator() -> 내부적으로 알아서 바꿔줌.

		while (iter.hasNext()) {
			// iteration의 다음 요소를 반환함
			System.out.println("값 확인 : " + iter.next());
			// 출력 : 값 확인 : 1
			// 출력 : 값 확인 : 2
		}

		// getRandomNumber() 메서드가 호출되면 데이터를 관리하고자 한다.
		HashSet<Integer> lottoNumbers = new HashSet<Integer>();

		int whileCount = 0;
		while (lottoNumbers.size() < 6) {
			lottoNumbers.add(getRandomNumber());
			whileCount++; // 0부터 5까지 6번 반복해서 수 6개 생성
		}
		System.out.println(lottoNumbers); // 랜덤으로 6개의 수를 출력해줌.
		System.out.println("반복 횟수 : " + whileCount); // 반복 횟수 : 6
	} // end of main

	public static int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(45) + 1; // 1 ~ 45
	}
} // end of class
