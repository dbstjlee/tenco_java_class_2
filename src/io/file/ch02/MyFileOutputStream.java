package io.file.ch02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutputStream {

	// 코드의 시작점
	public static void main(String[] args) {

		long start = System.nanoTime();

		// 데이터가 존재(이 코드 기준)(나가는거)
		String data = "Hello, Java TileOutputStream \n안녕반가워"; // H는 정수값으로 72를 받아옴.

		// 1. 파일에다가 데이터를 저장하고 싶다면(바이트 기반)
		// 자바 8버전부터 제공
		// try-catch-resoure -> (자동으로 자원을 닫아준다.) (finally{close} 안 해도 됨)

		// 파일을 보냄. 없으면 알아서 만들어 줌.
		// try (FileOutputStream fos = new FileOutputStream("output.txt" , true)) {
		try (FileOutputStream fos = new FileOutputStream("output.txt", false)) {
			// true : 이어 붙여넣기 (append) false : 이어 붙이기 off
			// 수행 코드
			// data 변수(String) 가지고 있는 문자열들을 바이트 배열로 반환 처리
			// byte[] bytes = data.getBytes(); // getBytes는 주소값으로 확인됨.
			byte[] bytes = { 72, 101, 108, 108, 111 }; // Hello
			System.out.println("bytes : " + bytes);
			for (int i = 0; i < bytes.length; i++) {
				System.out.println("bytes[i] : " + bytes[i]);
			}

			// 연결된 스트림을 활용해서 바이트 배열을 파일에다가 흘려 보냄
			fos.write(bytes);

			System.out.println("파일출력스트림을 통해서 데이터를 씀");

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없음");
		} catch (IOException e) {
			e.printStackTrace();// 어디서 오류났는지 stack에서 추적하고 print(찍어달라)
		}
		// 가지고 있는 데이터를 인코딩 해서 파일을 생성하여 보여줌.

		// 동작 이해해보기
		// 파일에 바이트 단위로 데이터를 쓰고
		// 그 파일을 열었을 때 글자로 보이는 이유는 파일을 읽는 프로그램이
		// 파일 내에 바이트 데이터를 문자로 해석해서(문자 인코딩) 보여 주었다.

		long end = System.nanoTime();
		long duration = end - start;
		System.out.println("기반 스트림 파일 입출력 소요 시간 : " + duration);
		// 아까보다 3배 느림(데이터가 많을수록 시간이 더 걸림)
	}// end of main

}
