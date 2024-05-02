package basic.ch17;

public class Warrior extends Hero{
	
	// 실선
	public Warrior(String name, int hp) { // 호출한 내용 받을 수 있도록 매개변수 똑같이 입력하긷
		super(name, hp); // 부모 생성자 호출
	}

	// 오버라이드
	@Override
	void attack() {
		System.out.println("전사가 기본 공격을 합니다.");
	}
	
	
	void comboAttack() {
		System.out.println("전사가 2단 공격을 합니다.");
	}
	
	
}
