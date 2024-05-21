package io.file.ch05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CityInfoApp2 {

	public static void main(String[] args) {

		System.out.println("도시 이름을 입력하세요(예: Seoul, NewYork)");

		// try catch resource
		try (Scanner scanner = new Scanner(System.in)) {
			String city = scanner.nextLine();
			String fileName = city + ".txt"; // 변수와 문자, 상수값의 활용

			// FileReader 단점 보안 코드
			try (FileInputStream fis = new FileInputStream(fileName);
					// 단점 보안을 위해 FileInputStream 사용, 대상은 키보드가 아니라 fileName임.
					InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); //  FileInputStream을 통해 읽은 (바이트 -> 문자 데이터로 변환) 인코딩 설정함. 
					BufferedReader br = new BufferedReader(isr)) { // 기능 확장(수평적) , 상속은 수직적으로 기능 확장

				System.out.println(city + " 에 대한 정보 : ");
				// 한줄씩 읽어서 메모리 공간에 보관
				String line;
				// 한줄씩 읽는 br.readLine()
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (Exception e) {
				System.out.println("해당 파일을 찾을 수 없습니다.");
			}
		} catch (Exception e) {
		}
	} // end of main
} // end of class
