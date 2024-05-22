package io.file.ch08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyObjectStream {

	public static void main(String[] args) {

		// 객체 직렬화
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
			// person.txt 파일이 생성됨
			Person person = new Person("손흥민", 30); // 객체를 생성함.
			oos.writeObject(person); // 생성된 객체를 출력함.

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-------------------------------");

		// 객체 역직렬화
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {
			// 문자 기반 데이터를 읽으면 <-- 스트링 값 추출해서 코드상에 활용할 수 있도록
			// Object 만드는 코딩을 해야 한다. "name" , int
			Person person = (Person) ois.readObject(); // final -> 다운 캐스팅 하기
			// readObject()의 리턴 타입은 Object 임. 앞에 fianl 있음
			System.out.println(person);

		} catch (Exception e) {
			e.printStackTrace(); // 예외 처리 흐름 생성 가능
		}
	}
}
