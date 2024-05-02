package basic.ch21;

	// Animal class의 추상 메서드를 상속 받아서 class 명 앞에 abstract 입력해야 함.
	
	// 추상 클래스를 상속한 경우
	// 2가지 해결방법
	//1. 자식클래스를 추상 클래스로 만들어 버린다.
	//2. 추상 메서드를 오버라이드 해서 구현 메서드로 재정의한다.
public class Human extends Animal {

	// 재정의 --> 일반 메서드로 재정의
		@Override
		public void hunt() {
			System.out.println("권총으로 사냥을 합니다.");
		}
}