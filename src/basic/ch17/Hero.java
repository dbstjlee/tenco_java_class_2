package basic.ch17;

public class Hero {

	// + : public
	// - : private
	// 아무것도 X : default
	String name;
	int hp;

	public Hero() {
	} // 부모 클래스가 메모리에 먼저 떠야 함. -> 자식 생성자 먼저 만들어야 함.

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	void attack() {}

}
