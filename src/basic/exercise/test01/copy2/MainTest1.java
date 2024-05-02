package basic.exercise.test01.copy2;

public class MainTest1 {

	public static void main(String[] args) {

		// 문제 1
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		// 외부에서 객체를 생성함.

		// 메서드 의존 주입
		a.setB(b);
		b.setC(c);
		c.setD(d);
		
		// 내부에서 객체를 생성하지 않고 외부에서
		// 객체를 주입한 후에 D에 getName() 호출하시오.
		// a 참조변수로 시작해서 D의 name 값을 화면에 출력하시오.
		
		// 외부에서 주입 받을 수 있도록 코드를 작성
		System.out.println(a.getB().getC().getD().getName());

	}

}
