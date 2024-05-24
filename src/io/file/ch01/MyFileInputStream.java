package io.file.ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileInputStream {

	public static void main(String[] args) {
		// 외부에 있는 파일의 데이터를 읽으려면 input
		FileInputStream in = null; // 대상을 지정해야 데이터를 읽을 수 있음

		try {
			in = new FileInputStream("a.txt");

			// 1단계
			// int readData = in.read(); // 바이트 단위로 읽어들임.

			// 2단계
			// System.out.println((char)in.read());

			// 3단계
			// 읽을 데이터가 더이상 없다면 -1을 반환함.
			int readData;
			while ((readData = in.read()) != -1) {
				System.out.print((char) readData); // 한번에 파일에 있는 데이터를 전부 읽을 수 있음.
			}
			// 4단계 FileInputStream(기반 스트립) 대상에 접근해서 한 바이트씩 읽어들이는 기능을 가진다.
			// 1byte -> 127 ~ -128 : a --> 97, A --> 65(정수값으로 표현됨), 한글은 --> 대(정수값은?)
			// 한글 -> 정수값 하나씩 읽어들일 때 깨짐 (한글을 받아서 인코딩할 방법이 없다)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
