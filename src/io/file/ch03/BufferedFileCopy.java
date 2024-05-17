package io.file.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {

	public static void main(String[] args) {
		// (바이트 기반 스트림을 활용)
		// 기반 스트림 + 보조스트림을 활용해서
		// 파일 복사 기능을 만들고
		// 소요 시간을 측정하시오

		// 파일 경로 (복사할 대상)
		String sourceFilePath = "D:\\test\\a.zip";
		String destinationFilePath = "copy1.zip";
		// 소요 시간
		long start = System.nanoTime();

		try (FileInputStream fis = new FileInputStream(sourceFilePath);
				FileOutputStream fos = new FileOutputStream(destinationFilePath);
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {

			int data;
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}
			bos.flush(); // 매번 입출력을 발생하는 것이 아니라 한번에 입출력을 사용

			long end = System.nanoTime();
			// 소요 시간을 초 단위로 변환 --> 포멧팅
			double seconds = (end - start) / 1000000000.0;
			// String 클래스의 format 메소드 사용해보기
			String resultFormat = String.format("소요 시간은 : %.6f초 입니다.", seconds);
			// % 는 포멧 지정자의 시작
			// f 지정자는 float, double 유형의 변수를 인자로 받아 처리하겠다
			System.out.println(resultFormat);

		} catch (Exception e) {
			e.printStackTrace(); // 파일 저장 기능 가능
		}

	}

}