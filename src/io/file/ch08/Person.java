package io.file.ch08;

import java.io.Serializable;

// 특정 클래스를 직렬활하기 위해서는 상위 부모 또는 바로 Serializable을 구현해야 한다.
public class Person implements Serializable {

	// 같은 클래스에 버전이 다를 때 식별해주는 식별자 : serialVersionUID
	private static final long serialVersionUID = 1L; // 직렬화 버전 UID
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
