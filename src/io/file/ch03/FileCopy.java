package io.file.ch03;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {

		// 스트림은 기본적으로 단방향이다. (한 방향으로 데이터를 보냄)
		// 입력 스트림, 출력 스트림 두개가 필요하다.

		// 파일 경로(복사할 대상)
		String sourceFilePath = "C:\\Users\\KDP\\Desktop\\스샷\\a.zip";
		// 목적지 파일
		String destinationFilePath = "copy1.zip";

		// 소요시간 확인
		long startTime = System.nanoTime();
		// 소스 파일 경로에서 output 파일 경로 a.zip의 파일을 생성
		try (FileInputStream in = new FileInputStream(sourceFilePath);
				// inputfile에 a.zip에 빨대를 꽂음
				FileOutputStream out = new FileOutputStream(destinationFilePath)) {

			int data;
//			in.read(); // 데이터를 읽는 메서드(오버로딩),  한 바이트씩 읽어들이는 것을 정수로 표현함.
//			// 데이터가 얼마나 있는지 모르기 때문에 while문
			
			//         a -> 97, data = ( 97  != - 1 )  --> true
			// ... ...
			// 데이터를 더이상 읽을 것이 없을 때 data에 -1 값이 담김
			//          data =  - 1    !=  - 1 -> false 
			while ((data = in.read()) != -1) {
				// 파일에 출력
				// read()는 -1을 반환함.
				// true 라서 반복함.
				out.write(data);
			}

			System.out.println("입력스트림 -> 출력스트림 -> 입력 -> 출력 의 반복 완료");

		} catch (Exception e) {

		}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("복사의 소요 시간은 : " + duration);

		// 소요 시간을 초 단위로 변환하는 작업 = 포맷팅
		double seconds = duration / 1_000_000_000.0;
		// String 클래스에 format 메서드 사용해보기
		// (문자열, 값) 입력시 -> 하나의 문자열을 리턴해줌
		String resultFormat = String.format("소요 시간은 : %.6f초 입니다.", seconds); // .6 : 소수점 6번째 까지만 보여라
		// %는 포맷 지정자의 시작
		// f 지정자는 그 위치에 float, double 유형의 변수를 인자로 받아 처리하겠다.
		System.out.println(resultFormat);b
	}

}
