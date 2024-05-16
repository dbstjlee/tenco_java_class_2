package io.file.ch02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class MyBufferdOutputStream {

	public static void main(String[] args) {

		// 현재 시간(시작)
		// System.currentTimeMillis(); //1000분의 1초
		long start = System.nanoTime(); // 10억 분의 1 = 1초 //더 정밀한 현재 시간을 출력
		String data = "기반 스트림 + 보조 스트림을 활용해보자";

		// try catch resource 활용
		try (FileOutputStream fos = new FileOutputStream("output2.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos); // 보조 스트림 생성될 때 기반 스트림을 넣어줘야 함.
		// BufferedinputStream은 단방향이라서 안됨.
		) {

			// 코드 수행 부분
			byte[] bytes = data.getBytes();

			// 응용 프로그램에서 file로 하나씩 I/O 했으나 버퍼가 다 찰 때까지 데이터를 다 써서 file로 보냄.
			// 보조 스트림(버퍼)(장바구니 역할)
			bos.write(bytes);

			// 간혹 버퍼에 데이터가 남아 있다면 중복된 데이터를 쓸 수 있다.
			// 한번 사용한 다음에
			bos.flush(); // flush ==> 물을 내리다. (버퍼에 담겨있는 데이터를 비워야 새로운 데이터를 담을 수 있음.)

			System.out.println("보조 스트림을 활용한 파일 출력 완료");
			// 시간 측정 해보고 싶다

		} catch (Exception e) {
			e.printStackTrace();

		}

		// 현재 시간(종료)
		long end = System.nanoTime();
		// 종료 - 시작 -> 소요 시간
		long duration = end - start;
		System.out.println("소요 시간 : " + duration);
		// 나노 초는 10억 분의 1 -> 0.000287초
	}

}
