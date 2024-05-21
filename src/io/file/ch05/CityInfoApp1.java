package io.file.ch05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CityInfoApp1 {

	// txt 파일 내의 내용을 응용 프로그램 안으로 들고 와서 응용 및 가공 가능하다.
	public static void main(String[] args) {

		System.out.println("도시 이름을 입력하세요(예: Seoul, NewYork)");

		// try catch resource
		try (Scanner scanner = new Scanner(System.in)) {
			String city = scanner.nextLine(); // 입력값을 받도록 scanner 사용
			String fileName = city + ".txt"; // 변수와 문자, 상수값의 활용(변수 + 문자)

			// 1. 파일에 있는 데이터를 응용 프로그램으로 가져와야 한다.(문자 기반)
			// 자동으로 안 닫아줘서 try catch로 다시 감싸줘야 함.
			// FileReader(문자 기반 스트림이다.) 단 주의할 사항
			// 파일을 읽을 때 시스템의 기본 문자 인코딩을 사용한다. 운영체제 및 지역에 따라 다름.
			try (FileReader fr = new FileReader(fileName); // (city + ".txt") 파일 명을 읽을 수 있도록 한다.
					BufferedReader br = new BufferedReader(fr)) { // BufferedReader로 기능 확장
				System.out.println(city + " 에 대한 정보입니다.");

				String line;
				// 바이트 기반일 경우 -> 한글자씩 읽어줌
				// readLine() -> 보조 스트림(BufferedReader)의 기능 (한 라인(줄)씩 읽어주는 기능이라 성능이 좋음)
				while ((line = br.readLine()) != null) { // 더이상 읽을 것이 없으면 null
					System.out.println(line);
				}
			} catch (Exception e) {
				System.out.println("해당 파일을 찾을 수 없습니다.");
			}
		} catch (Exception e) {
		}
	} // end of main
} // end of class
