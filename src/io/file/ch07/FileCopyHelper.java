package io.file.ch07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyHelper {

	// 파일 복사
	public static void copyFile(String readFilePath, String writerFilePath) {

		try (FileReader fr = new FileReader(readFilePath); // 문자 기반이라 FileReader와 Writer 사용
				//readFilePath : 읽어들이는 파일 경로
				FileWriter fw = new FileWriter(writerFilePath)) {
				// witerFilePath : 출력하는 파일 경로

			int c;
			while ((c = fr.read()) != -1) { // fr가 데이터가 없을때까지 읽어들여라
				fw.write(c);// 출력하라
			}
			System.out.println("파일 복사 완료 : " + writerFilePath);// 파일이 복사됨.

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 복사 중 오류 발생");
		}

	}

	// 파일 복사 - 버퍼 활용
	public static void copyFileWithBuffer(String readFilePath, String writerFilePath) {

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(readFilePath));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writerFilePath))) {
			// 기반 스트림이 들어와야 함. 직접 파일에 접근할 수 없음 -> 생성자 바로 작성

			// 버퍼를 활용하는 버퍼의 크기를 지정할 수 있다.
			char[] buffer = new char[1024];
			int numCharsRead; // 읽은 문자 수

			// 배열의 크기만큼 가져옴.(1024 바이트 만큼 읽어서 한번에 가져옴)
			while ((numCharsRead = bufferedReader.read(buffer)) != -1) {
				bufferedWriter.write(buffer, 0, numCharsRead); // 하나씩 읽어서 끝까지 가져와라, 0번째, numCharsRead 만큼
				System.out.println("numCharsRead : " + numCharsRead);
			}

			System.out.println("버퍼를 사용한 파일 복사 완료 : " + writerFilePath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("버퍼를 사용한 파일 복사 중 오류 발생");
		}

	}

	// 메인 함수
	public static void main(String[] args) {
		FileCopyHelper.copyFile("Seoul.txt", "copySeol.txt"); // 클래스명 내의 copyFile 매서드 호출(복사할 파일 경로, 복사될 파일 경로)
		System.out.println("-----------------------------");
		FileCopyHelper.copyFileWithBuffer("NewYork.txt", "copyNewYork.txt");
		
	}// end of main

}// end of class
