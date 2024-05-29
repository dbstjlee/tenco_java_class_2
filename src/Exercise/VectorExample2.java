package Exercise;

import java.util.Collections;
import java.util.Vector;

class Monster {
	String name;
	double hp;

	public Monster(String name, double hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
		return "{" + name + "," + hp + "}";
	}
}

public class VectorExample2 {

	public static void main(String[] args) {

		// Monster 객체를 저장하는 벡터를 생성한다.
		Vector<Monster> list = new Vector<>();

		// Monster 객체를 벡터에 추가한다.
		list.add(new Monster("Mon1", 100));
		list.add(new Monster("Mon2", 200));
		list.add(new Monster("Mon3", 300));

		System.out.println("벡터의 크기 : " + list.size());
		System.out.println(list);

	}
}
