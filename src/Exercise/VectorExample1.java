package Exercise;

import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {

		// 문자열을 저장하는 백터 객체를 생성 + 크기를 줌.
		Vector<String> vec = new Vector<String>(2);

		vec.add("Apple");
		vec.add("Orange");
		vec.add("Mango");

		System.out.println("벡터의 크기 : " + vec.size());
		Collections.sort(vec); // 벡터에 저장된 문자열을 정렬한다. 

		for (String s : vec) 
			System.out.print(s + " ");
	}
}
