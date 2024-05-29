package Exercise;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		// 백터 객체를 생성할 때 크기를 줄 수도, 안 줄 수도 있다.
		Vector vc = new Vector();

		// 어떤 타입의 객체도 추가가 가능하다.
		vc.add("Hello world!");
		vc.add(new Integer(10));
		vc.add(20);

		System.out.println("vecter size : " + vc.size());

		for (int i = 0; i < vc.size(); i++) {
			System.out.println("vector element " + i + " : " + vc.get(i));
		}
		// get()은 Object 타입으로 반환하므로 String 타입으로 형변환해서 사용한다.
		String s = (String) vc.get(0);
	}
}
