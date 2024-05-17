package io.file.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 문자 기반 스트림 + 보조 문자 기반 스트림 확인
// 한줄 입력하면 종료됨
// 여러 줄 반복적으로 동작할 수 있도록 기능을 추가해주세요 
// 글자 쓰고 엔터 치고 .. 계속 받을 수 있도록
public class StandardInputExample2 {

	public static void main(String[] args) {

		System.out.println("여러 줄의 텍스트를 입력하세요");
		System.out.println("입력을 종료하려면 빈 줄에서 엔터를 누르세요");
		// <-- 종료
		// 안녕 -> 엔터 사용하면 출력
		// ""(아무것도 입력X) -> 엔터 종료가 됨

		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용한다!!
		try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
				BufferedReader br = new BufferedReader(isr)) {

			boolean flag = true;
			while (flag) {
				String inputUserData = br.readLine();
				System.out.println("입력 확인 : " + inputUserData);

//				if (inputUserData != -1) {
//					flag = false;
//				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
