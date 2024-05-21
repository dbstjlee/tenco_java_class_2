package io.file.ch06;

import java.io.BufferedWriter;
import java.io.FileWriter;

// 버퍼를 활용한 파일 출력 스트림의 사용
public class MyFileBufferedWriter {

	public static void main(String[] args) {

		String filePath = "output3.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {// 기반 스트림이 들어와야 함.
			bw.write("첫번째 줄입니다.");
			bw.newLine();
			bw.write("두번째 줄입니다.");
			bw.newLine();
			bw.write("세번째 줄입니다.");

			// 버퍼를 비우고 데이터 쓰기
			bw.flush();

		} catch (Exception e) {

		}
	}// end of main
}// end of class
