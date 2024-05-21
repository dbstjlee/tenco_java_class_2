package io.file.ch06;

import java.io.FileWriter;

public class MyFileWriter {

	public static void main(String[] args) {

		// 파일에다가 문자 기반 스트림을 활용해서 데이터를 써 보자.
		String data = "Hello, Java File I/O";

		// 실행시켜서 프로젝트에서 F5 누르면 "example.txt" 파일이 자동으로 생성됨.
		try (FileWriter writer = new FileWriter("example.txt")) { 
			// FileWriter는 클래스이다. 텍스트 데이터를 처리함.
			// 파일에다가 문자열 쓰기
			writer.write(data);
			writer.write("\n"); // 한 줄 띄움
			writer.write("추가 글을 작성할 수 있음");

			// 물을 내리다.
			writer.flush();
			System.out.println("파일에 데이터 쓰기 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
