package basic.ch11;

public class PersonTest {

	public static void main(String[] args) {

		// (main)함수 안 변수 = 지역변수
		Person person1 = new Person("홍길동", 100);
		Person personBox = person1; // person1이 personBox에 담김
		Person personBox2 = person1.getPerson();// Person.java의 getPerson을 호출해서 자신이 주소값을 가짐.
		// -> heap 메모리에 생성된 person1의 주소값을 personBox, personBox2가 같은 객체의 주소값을 가짐.
		Person personLee = new Person("이순신", 101);
		System.out.println("------------------------");
		// 위 코드까지는 heap 메모리 영역에 객체가 2개 생성된 상태이다.
		// 지역변수인 person1, personBox, personBox2는 같은 객체를 가리킨다.

		// 연습 문제 - setName 메서드 만들기

		// name을 홍길동 -> 티모로 바꾸기
		personBox.setName("티모");
		person1.showInfo();

	}// end of main

}// end of class
