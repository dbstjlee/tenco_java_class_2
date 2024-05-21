package structure.ch05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import basic.ch22.Student;

public class MyArrayListTest {

	// 메인 쓰레드
	public static void main(String[] args) {

		List mList; // 리스트 인터페이스 계열

		// 자료구조 5개 선언
		// ArrayList<E> //<E>: 제네릭
		// ArrayList 클래스의 인스턴스화 처리
		ArrayList list = new ArrayList(); // 제네릭 설정 안 함 (Object) // 초기 용량 10이 지정되고 늘었다가 줄었다가 함.
		// 제네릭은 타입의 명시화이다.
		ArrayList<Integer> nums = new ArrayList<Integer>();
		// num -> 정수값만 들어갈 수 있음.(int: 기본 데이터 타입)
		// 변수의 선언과 동시에 초기화 --> 값이 들어가 있는 상태인가?
		// 값을 동시에 추가하고 싶다면 Arrays.asList(1,2,3,4,5) -> 메모리 공간 선언하고 값을 초기화함.
		ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // 타입 추론 가능 -> 중복(Integer)은 생략 가능
		// Arrays.asList(): 배열을 받아서 리스트 형태로 반환(배열기반 -> 컬렉션 기반)

		ArrayList<String> vocabulary = new ArrayList<String>(); // 여기는 문자열만 다룰 수 있음
		ArrayList<Student> members = new ArrayList<>();

		// 클래스의 정의된 기능을 알아봐야 한다.
		// 값 추가 방법
		list.add(3);
		list.add(null);
		list.add(1, 10); // index 1 위치에 요소 10을 삽입, 기존 요소가 있었다면 뒤로 자동 이동
		System.out.println("값 추가 확인 : " + list); // 3, 10, null이 출력됨.
		// list : 참조 변수 - 주소값(4byte) 근데 toString 이 정의되어 있다.
		Student student = new Student("홍박사");
		System.out.println(student); // 주소값 출력됨.

		// 값 삭제
		list.remove(2); // index 기반 -> index 2번째(null) 요소 삭제
		System.out.println("값 삭제 확인: " + list); // -> null 이 삭제됨.

		// 전체 삭제
		// list.clear();
		// System.out.println("전체 삭제 확인 " + list);

		// 리스트 사이즈 확인(요소의 개수, 사이즈 개념)
		System.out.println(list.size()); // size 는 배열의 크기가 아닌 요소의 개수를 나타냄
		// -> size : 2(요소의 개수)(3, 10)

		// 하나의 요소를 꺼내는 방법
		// System.out.println(list.get(0)); // clear 하면 0번째 인덱스에 아무것도 없음 ->
		// IndexOutOfBoundsException
		// -> 예외 처리하기

		try {
			System.out.println(list.get(1));// 0 => 3, 1 => 10
		} catch (Exception e) {
			System.out.println("프로그램이 종료 되지 않게 처리");
		}

		// ArrayList 와 반복문의 활용
		nums = list; // 복사 개념(얕은 복사 개념!!!) , 리스트의 주소를 넣음
		// -> 가리키는 객체가 달라짐!!
		System.out.println(list); // list 객체 내에 3,10 넣어둠
		System.out.println("------------------------------");

		list.add(10000);// 출력한 후 다시 추가하는 요소를 호출함 => 3, 10, 10000가 출력됨.
		System.out.println(nums); // nums 객체가 아닌 같은 list 객체를 가리킴(얕은 복사)
		// for(Integer i : list) {} -> list 는 컴파일 시점의 Object 타입으로 인식

		// 향상된 for문 // 처음~ 끝까지 무조건 돌아감
		for (Integer i : nums) { // nums 는 Integer로 선언되어서 오류 안 뜸
			System.out.println(" i : " + i);
			// 출력 결과
			// i : 3
			// i : 10
			// i : 10000
		}

		// ArrayList 안에 값이 포함되어 있는가 확인
		System.out.println("3이 nums 리스트에 존재하는가?" + nums.contains(3)); // true // contains는 boolean 타입이다.
		// contains에 3이라는 값을 넣으면 true -> 3이 포함되어 있다는 의미
		System.out.println("500이 nums 리스트에 존재하는가?" + nums.contains(500)); // false
		// false -> 없다는 의미

		// 요소의 위치(index) 확인
		System.out.println("요소 3이 몇 번째 인덱스에 위치 하니? -> " + nums.indexOf(3)); // 0
		// 3이 0번째 인덱스에 위치함. // 반복 시 앞에 있는 값이 먼저 출력됨.
		System.out.println("요소 10이 몇 번째 인덱스에 위치 하니? -> " + nums.indexOf(10)); // 1
		// 1번째에 위치함
		System.out.println("요소 500이 몇 번째 인덱스에 위치 하니? -> " + nums.indexOf(500)); // - 1
		// 자료구조에 값이 없다면 -1을 반환함

		// Iterator 요소 순회(반복자)
		Iterator<Integer> iter = nums.iterator(); // iterator 타입으로 변환시킴 -> 맨 위에 Iterable<T> 존재하기 때문임
		while (iter.hasNext()) { // 반복문을 통해 값을 꺼냄
			System.out.println("while 을 활용하는 방법 : " + iter.next());
			// 3
			// 10 
			// 10000
		}

		// 배열, ArrayList 사용해야 할 때를 알자!!
		// 배열의 특징 -> 검색이 빠름. 데이터 타입이 정해져 있음
		// ArrayList -> 반복적으로 삭제, 삽입, 늘었다가 줄었다가 할 때 사용

	}// end of main

}// end of class
