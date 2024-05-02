package basic.ch05;

public class OrderMainTest {

	public static void main(String[] args) {

		// Oder 클래스를 인스턴스화 시키자.
		// 참조 타입 변수명은 oderBox1임.
		Order orderBox1 = new Order(); // 객체를 생성함.
		// new 키워드와 Order(데이터타입)();
		System.out.println(orderBox1); // 실제 값이 아닌 주소값이 출력됨.

		System.out.println("-------------");
		
		// Heap 메모리에 생성된 객체에 접근하여 객체의 속성값을 넣음.
		orderBox1.username = "사람이름";
		orderBox1.Ordername = "음식이름";
		orderBox1.address = "주소";
		orderBox1.Orderprice = 20000;

		// 객체의 속성값을 출력함.
		System.out.println(orderBox1.username);
		System.out.println(orderBox1.Ordername);
		System.out.println(orderBox1.address);
		System.out.println(orderBox1.Orderprice);
	}

}
