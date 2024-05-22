package io.file.ch08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyDataStream {

	public static void main(String[] args) {

		// 데이터 쓰기 - 바이트, 문자 기반이 아닌 기본 자료형 데이터 타입으로 보내기
		// 파일의 사용 -> FileOutputStream("대상 파일 이름")(기반스트림) <-- 확장 (보조스트림)
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("Student.txt"))) {
			// Student.txt 파일 생성
			dos.writeInt(101); // 학번
			dos.writeUTF("홍길동"); // 이름
			dos.writeDouble(3.5); // 학점
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(">>> 데이터 쓰기 완료(원시타입) <<<");

		// 기본 데이터 타입으로 데이터 읽기
		try (DataInputStream dis = new DataInputStream(new FileInputStream("Student.txt"))) {
			// 위에서 생성된 Student.txt 파일을 읽어들임
			int id = dis.readInt(); // read로 바로 가지고 올 수 있음
			String name = dis.readUTF();
			double score = dis.readDouble();

			System.out.println("학번 : " + id); // read()메서드로 읽어들이 정보에 변수명을 줘서 출력함
			System.out.println("이름 : " + name);
			System.out.println("학점 : " + score);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(">>> 데이터 읽기 완료(기본 데이터 타입) <<<");
	}// end of main
}
