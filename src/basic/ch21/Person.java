package basic.ch21;

// ctrl + T : 계층 구조가 나옴. 또는 우측 마우스 클릭> Quick Type H~
public class Person extends Human {

	@Override
	public void hunt() {
		System.out.println("권총으로 사냥을 합니다.");
	}
}
