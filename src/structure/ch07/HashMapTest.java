package structure.ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {

		// key, value 구조 한 쌍이다.
		// 업캐스팅된 상태이다.
		Map<String, String> books = new HashMap<String, String>();
		// Map<Key, Value>
		// 부모: Map 자식: HashMap

		// 추가 : 데이터 추가
		books.put("해리포터", "J.K 롤링"); // books에 접근해서 put()-> 키, 값 저장
		books.put("반지의제왕", "J.R.R 톨킨");
		books.put("1984", "조지오웰");

		// 읽기 : 데이터 읽기
		String author = books.get("해리포터"); // key 값 입력
		System.out.println("해리포터 저자 : " + author); // value 값이 출력

		String author2 = books.get("1984");
		System.out.println("1984 저자 : " + author2);

		// 수정 : 데이터 수정(갱신)
		books.put("1984", "조조입니다"); // key 값 중복 시 value 값 덮어씌움
		System.out.println(books.get("1984")); // value 값(갱신된 '조조입니다')가 출력

		// 삭제 : 데이터 삭제
		books.remove("1984");

		// 유용한 기능 확인
		// 1. 자료구조 map 에 저장되어 있는 key 값들을 확인하는 방법
		System.out.println(" map 자료구조의 key 값 확인 " + books.keySet());
		// 출력: 해리포터, 반지의 제왕(1984는 위에서 삭제함)
		// 순서가 없는 데이터 타입으로 변환하고 key값을 반환함

		// 반복문 활용
		// map 구조는 순서가 없어서 for -> use index 사용 불가 => foreach 방법 사용하기
		System.out.println("--------------------------------");
		for (String key : books.keySet()) { // books -> key or value를 전달해야 할지 컴파일러가 몰라서 오류 뜸
			// books.keySet(): 자료구조 map 에 저장되어 있는 key 값들을 확인
			// String key: key 값들을 순차적으로 key에 전달
			// key를 통해 값을 출력
			System.out.println("key 값 호출 : " + key);
			System.out.println("key를 통해서 value에 접근: " + books.get(key)); // key에 접근해서 value를 출력하기 위함
			// 출력 : key 값 호출 : 해리포터
			// key를 통해서 value에 접근: J.K 롤링
		}

		// 두번째 방법
		// 반복자 활용하는 방법
		// 한 쌍이라 바로 변환이 안 됨 => entrySet()(set 계열)
		System.out.println("---------------------------------------");
		Iterator<Entry<String, String>> iter = books.entrySet().iterator(); // 형변환이 목적임
		while (iter.hasNext()) { // iter.hasNext() 요소가 있으면
			// Entry<String, String> 라는 게 있으면 true를 반환함.
			Entry<String, String> entry = iter.next(); // 요소가 반환됨. -> entry로 묶어서 사용//(entry)개념 알기
			System.out.println(" 책 : " + entry.getKey() + "저자 : " + entry.getValue());
		}
		System.out.println("-------------------------------------");
		// 자료구조에서 제공하는 foreach 구문의 사용
		// 람다 표현식 : 1. 타입 추론 가능 -> 코드 줄임 2. 화살표기법을 사용한다.
		books.forEach((key, value) -> {
			System.out.println("key : " + key);
			System.out.println("value : " + value);
		});// books. => 상속 구조가 있음.
		// 매개변수 key,value 이 튀어나옴. 횟수만큼 반복을 함.

		// 전체 삭제
		books.clear();
		// 요소의 개수 확인
		System.out.println(books.size()); // 0
	}// end of main
}// end of class
