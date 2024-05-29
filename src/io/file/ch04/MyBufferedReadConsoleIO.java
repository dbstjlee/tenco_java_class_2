package io.file.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyBufferedReadConsoleIO {

	public static void main(String[] args) {

		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용한다!!
		try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
				// 키보드에 빨대를 꽂아둠
				// 문자 기반이라 BufferedReader 써야함.
				BufferedReader br = new BufferedReader(isr)) {

			// isr -> 한 문자씩 읽는 기능인 read()를 가지고 있었다.
			// br(보조 스트림) -> 한번에 한 라인씩 읽을 수 있는 기능을 가지고 있다.
			// 한줄 단위란 엔터 칠때까지 란 의미
			System.out.println("더 많은 텍스트를 입력하세요(한줄 단위) -> 엔터");

			// isr.read(); -> 기능 확장인
			String inputUserData = br.readLine();
			System.out.println("입력 확인 : " + inputUserData);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
