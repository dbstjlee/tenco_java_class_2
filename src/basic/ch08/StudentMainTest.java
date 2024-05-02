package basic.ch08;

public class StudentMainTest {

	public static void main(String[] args) {
		
		// 모양을 맞춰야 하는 강제성이 생김.
		Student s1 = new Student("홍길동", 101, 3);// 객체
		System.out.println(s1); // 주소값이 출력됨.
		s1.showInfo();
		
		// 연습문제
		// s2 참조 변수에 이름으로 학생을 메모리에 올리고
		// 호출해주세요.
		Student s2 = new Student("Lee", 100, 3);
		System.out.println(s2);
		
		//멤버변수와 생성자에 값을 넣는것은 동일
		
		// 변수에 직접 접근해서 값을 초기화해보세요
		Student s3 = new Student(); // 기본 생성자로 메모리에 올림.
		s3.name = "야스오"; // . 연산자로 직접 접근해서 값을 넣어야 함.
		s3.number = 103;
		s3.grade = 1;
		
		
		// 생성자를 여러개 만들 수 있음. 
		// 이를 생성자 오버로딩이라고 한다.

	}// end of main

}// end of class
