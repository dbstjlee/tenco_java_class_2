package io.file.ch01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MyBufferedInputStream {

	public static void main(String[] args) {

		// 보조 스트림의 사용 -> 기반 스트림이 필요하다.
		FileInputStream fin = null;
		BufferedInputStream bfin = null; // 응용프로그램에서 리소스를 한번만 읽고 들어오는 것이 아니라 전부 다 읽고 들어옴.
		// 외부 리소스에 접근하기 위해 FileInputStream, BufferedInputStream(자원을 열었음)
		// 메모리 누수를 막기 위해 자원을 닫아야 함.
		// 기능 확장만 있음. 입력 소스에 직접적으로 접근 불가능함.
		
		try {
			// 기반 스트림
			fin = new FileInputStream("a.txt");

			// 보조 스트림(기반 스트림)
			bfin = new BufferedInputStream(fin); // 성능이 더 향상됨
			// 기능 확장(수평적)(수직적: 상속)

			int data; // 메모리 공간 선언

			while ((data = bfin.read()) != -1) {
				System.out.print((char) data);
			}

		} catch (Exception e) {
			// 리소스 자원 정리 -> 반대로 -> 열었던 자원의 순서를 반대로 닫아주면 된다.
			// 예외 처리
			if (bfin != null) { // bfin != null 이면 받겠다는 의미
				try {
					bfin.close(); // 닫았음
				} catch (IOException e1) {
					e1.printStackTrace();
				} // 자원을 닫을 때도 예외처리해야 함. 

			}

			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		}

	}// end of main

}
