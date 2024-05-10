package structure.ch06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class UniqueUserIDSystem {

	private HashSet<String> userIDs;

	public UniqueUserIDSystem() {
		this.userIDs = new HashSet<String>();
	}

	// 기능
	// 사용자 ID 등록 기능
	// 정상적으로 들어가면 true
	// 중복 발생하면 false
	public boolean registerUserID(String userId) {
		return userIDs.add(userId);
	}

	// 시스템 실행
	public void run() {
		// 동작 - 스캐너 활용
		Scanner scanner = new Scanner(System.in);
		// 실행 흐름 만들기 -> while, if
		// 결과 -> 정상 유저 등록
		// -> 이미 등록된 사용자입니다. (아이디가 존재합니다.)

		while (true) {
			System.out.println("아이디를 입력하세요.");
			String input = scanner.nextLine(); // String 값 입력 받기
			if ("exit".equals(input)) {
				System.out.println("시스템을 종료합니다.");
				break; // while 문 종료
			}
			
			boolean isRegistered = registerUserID(input);
			if (isRegistered) {
				System.out.println("새로운 사용자가 등록되었습니다." + input);
			} else {
				System.out.println("이미 등록된 사용자입니다. " + input);
			}

		} // while 구문 끝
		scanner.close();
	} // run() 메서드 끝

	// 코드 테스트
	public static void main(String[] args) {
		UniqueUserIDSystem system = new UniqueUserIDSystem();
		system.run();

	} // end of main

}
