package basic.ch22;

public class Actor implements Romeo { // 인터페이스가 추상화가 높음.

	String name;

	public Actor(String name) {
		this.name = name;
	}

	@Override
	public void performAsRomeo() {
		System.out.println(name + "가 오호 ~ 줄리엣 연극을 합니다.");
	}

}
