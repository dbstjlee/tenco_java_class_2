package basic.ch17;

// 상상력 추가
// 선임이 작성한 코드라고 가정
public class A {

	String name;
	int height;
	int weight;
	int age;

	// 바로 수정...

}

// 단, 하나의 자바 파일 안에 여려 개의 클래스를 작성할 수 있다. 
// 단, public 이 붙은 클래스는 오직 하나만 정의 가능하다. 
// 복사 붙여넣기도 가능
class B { // public 빼면 default임.

	String name;
	int height;
	int weight;
	int age;

	int level;
	String nickName;

}

// 상속이라는 문법을 배운 개발자라면
// 상속할 때 extends 사용(A가 부모, C가 자식/ C가 A로부터 상속 받은 후 기능적으로 확장되서 크기가 크다.)
class C extends A {

	int level;
	int nickName;
	String phone;

}
