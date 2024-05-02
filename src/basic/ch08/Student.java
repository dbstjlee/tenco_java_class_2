package basic.ch08;

public class Student {

	// 생성자 - constructor
	// 객체를 생성할 때 다음과 같은 모양으로 만들어라고 강제로 지시하는 것
	// 생성자는 객체를 생성할 때 반드시 존재해야 한다.
	
	String name;
	int number;
	int grade;
	
	// 생성자는 리턴 타입이 없다.(리턴 타입 있으면 함수나 메서드를 의미함)
	// 클래스 이름과 같다면(대문자까지 동일) 생성자라고 부른다.
	public Student() { } // <- 기본 생성자
	// 기본 생성자는 컴파일러가 .class 파일을 만들때 
	// 사용자 정의 생성자가 하나도 없다면
	// 자동으로 위의 코드를 넣어준다.
	// 개발자가 위의 코드를 안 넣으면 컴파일러가 자동으로 생성해주는게 기본 생성자
	
	// 사용자 정의 생성자란?
	// 클래스 설계자가 인스턴스화 했을 때 정상적으로 
	// 동작해야 하는 초기값들이 필요하다면 강제성을 부여하는 것
	// 매개변수가 있으면 사용자 정의 생성자라고 함.
	public Student(String s, int n1, int n2) {
		name = s;
		number = n1;
		grade = n2;

	// 중요 별표 3개
	// 생성자는 객체가 처음 만들어 질 때
	// 제일 먼저 수행하는 코드이다.
		showInfo();
	}
	
	// 생성자( public Student(){} )를 여러개 만들 수 있음.
	// 생성자 2개임.
	
	// 메서드 정의(멤버 변수에 의해 정의됨)
	public void showInfo() {
		System.out.println("학생의 이름은 "+ name); // name: 멤버변수
		System.out.println("학생의 번호는 " + number);
		System.out.println("학생의 학년는 " + grade);
	}

	
}// end of class
