package io;

import java.io.IOException;

public class MySystemIn2 {

	public static void main(String[] args) {

		// 키보드에서 데이터를 응용 프로그램 안으로 넣기
		System.out.println("알파벳 하나를 쓰고 Enter를 누르세요");

		// 바이트 동작 -> 0과 1로 구성
		// 정수 -> byte, short, int, long

		int i;
		// 한 바이트씩 키보드의 값을 읽어라

		try {
			//              97             !=  13 --> true
			// \n: 줄바꿈 enter 의미
			while( ( i = System.in.read() ) != '\n' ) {
				System.out.println(" i : " + i);
				System.out.println(" (char)i : " + (char)i);
			}
			
//			i = System.in.read(); // 한 바이트씩 데이터를 읽음 -> 이거를 여러번 반복(while)
//			System.out.println("--------------------------");
//
//			// 출력
//			System.out.println("i : " + i);
//
//			// 문자로 변환하고 싶다면 --> 컴퓨터 안에 있는 문자표를 활용(인코딩(정수값 -> 문자))
//			System.out.println((char) i); // 97은 a로 약속되어 있음

		} catch (IOException e) {
			e.printStackTrace();
		}

	}// end of main

}// end of class
