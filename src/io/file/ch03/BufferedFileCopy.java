package io.file.ch03;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {

	public static void main(String[] args) {
		// 바이트 기반
		// 기반 스트림 + 보조스트림을 활용해서
		// 파일 복사 기능을 만들고
		// 소요 시간을 측정하시오.

		long start = System.nanoTime();
		String data = "기반 스트림 + 보조 스트림";

		// 복사할 파일
		String sourceFilePath = "경로";

		// 목적지 파일
		String destinationPath = "output.zip";

		// 복사 기능 생성
		try (FileInputStream fis = new FileInputStream(sourceFilePath);
				FileOutputStream fos = new FileOutputStream(destinationPath);
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {

//			byte[] bytes = data.getBytes();
//			bos.write(bytes); // 버퍼(장바구니)에 담고
//			bos.flush(); // 비워줌

			int data1;
			while ((data1 = fis.read() != -1)) {

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
