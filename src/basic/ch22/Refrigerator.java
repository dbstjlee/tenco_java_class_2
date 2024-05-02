package basic.ch22;

public class Refrigerator extends HomeAppliances implements RemoteController, SoundEffect{
	// 다중 구현 = , 인터페이스명

	@Override
	public void turnOn() {
		System.out.println("냉장고를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고를 끕니다.");
	}

	@Override
	public void soundOn() {
		System.out.println("띠리링 ~~~");
	}



	
	
}
