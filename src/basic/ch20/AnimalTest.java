package basic.ch20;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.move();
		animal.eating();
		System.out.println("-------------");

		Animal 주소2 = new Tiger(); // 부모의 데이터 타입으로 자식의 객체를 주입하는 상황 = 업캐스팅 상황
		주소2.move();
		주소2.eating();
		System.out.println("-------------");

		Animal 주소3 = new Human();
		주소3.move();
		주소3.eating();

		// 다형성의 효용
		// Human에는 readBooks 메서드가 있는데 출력이 안 됨.
		// 컴파일 시점 -> Animal에 있는 데이터 타입만 실행
		// 런타임 시점 -> 해당하는 객체만 들어감

		//int n1 = (int) 10.5; // 강제 형변환

		((Human) 주소3).readBooks(); // Aminal에 해당하는 객체만 출력되었기 때문에 강제 형변환을 해서 Human의 readBooks를 호출
		System.out.println("-------------");
	}
}
