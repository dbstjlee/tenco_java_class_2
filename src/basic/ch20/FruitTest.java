package basic.ch20;

public class FruitTest {

	public static void main(String[] args) {

		// 다형성: 다양한 형태의 클래스(데이터 타입)를 바라 볼 수 있다.

		Fruit fruit1 = new Banana();// 업캐스팅된 상태(부모의 데이터 타입으로 자식의 주소값을 할당한 상태)
		Fruit fruit2 = new Peach();

		fruit1.showInfo();
		fruit2.showInfo();

		System.out.println("-------------------------");

		// 다형성을 사용하면 코드를 유용하게 작성할 수 있다.
		Banana banana1 = new Banana();// 업캐스팅된 상태(부모의 데이터 타입으로 자식의 주소값을 할당한 상태)
		Peach peach1 = new Peach();
		Peach peach2 = new Peach();

		Fruit[] fruits = new Fruit[3]; // 과일의 배열 타입
		fruits[0] = banana1; // 바나나라는 객체가 들어있음.
		fruits[1] = peach1;
		fruits[2] = peach2;

		System.out.println("-------------------------");

		// fruits[0] --> 바나나
		// 바나나의 속성인 origin 을 출력하시오.
		// 바나나의 기능인 saleBanana() 메서드를 호출하시오.

		// fruits[0] <--- 여기부터 시작 (바나나 객체로 치환한다.)

		// Banana bananaCasting = ((Banana)fruits[0];
		// bananCasting.origin;
		System.out.println(((Banana) fruits[0]).origin); // fruits[0]를 바나나의 형태(타입)로 바라봐줘. 명시적인 형변환
		((Banana) fruits[0]).saleBanana(); // 바나나라는 타입으로 바라봐서 메소드를 호출할 수 있음.
		
		System.out.println("-------------------------");
		// 배열은 반복문과 함께 많이 사용됨.
		
		// 클래스를 형변환할 때 예외가 발생했다는 오류 발생(ClassCastException)
		// 0 --> 바나나
		// 1 --> 복숭아
		
		// instanceof 연산자를 알아야 해결 가능
		// instanceof -->
		// 실행 시점에 객체가 특정 클래스의 인스턴스인지 확인하는 키워드
		for (int i = 0; i < fruits.length; i++) { // 3번 돌아감.
			// 방어적 코드 작성
			if(fruits[i] instanceof Banana) { //fruits[i]가 Banana
				((Banana)fruits[i]).saleBanana();  // 과일배열을 바나나로 다운캐스팅 해야만 saleBanana이게 뜸
			} else {
				fruits[i].showInfo();
			}
		
		}
	}// end of main


	}// end of class
