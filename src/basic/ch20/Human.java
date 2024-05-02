package basic.ch20;

public class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}

	@Override
	public void eating() {
		System.out.println("밥을 먹습니다.");
	}

	public void readBooks() {
		System.out.println("책을 읽습니다.");
	}
	// Human을 class로, Animal 클래스로 다양성으로 바라봄.
}

//move + ctrl + space -> overrid 선택 // 재정의함.