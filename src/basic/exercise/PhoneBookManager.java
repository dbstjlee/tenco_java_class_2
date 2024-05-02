package basic.exercise;

import java.nio.channels.SelectableChannel;
import java.util.Scanner;

public class PhoneBookManager {
	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		// 사용하는 쪽
		// Scanner 사용
		// 배열 선언 100개
		// while
		Scanner sc = new Scanner(System.in);
		PhoneBook[] number = new PhoneBook[100];

		number[0] = new PhoneBook("이00", "010-0000-0000");
		number[1] = new PhoneBook("김00", "010-0000-0000");
		number[2] = new PhoneBook("박00", "010-0000-0000");
		number[3] = new PhoneBook("송00", "010-0000-0000");
		LAST_INDEX_NUMBER = 4;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String UPDATE = "4";
		final String DELETE_ALL = "5";
		final String END = "0";

		boolean flag = true;

		while (flag) {
			System.out.println("** 메뉴 선택 **");
			System.out.println("1.저장 2. 전체 조회 3. 선택조회 4.수정 5.전체 삭제 0.프로그램 종료");
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(SAVE)) {
				System.out.println(">> 저장하기 <<");
				save(sc, number);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">> 전체 조회 하기 <<");
				readAll(number);
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">> 선택 조회 하기 <<");
				readByNumber(sc, number);
			} else if (selectedNumber.equals(UPDATE)) {
				System.out.println(">> 수정 하기 <<");
				update(sc, number);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">> 전체 삭제 하기 <<");
				deleteAll(number);
			} else if (selectedNumber.equals(END)) {
				System.out.println(">> 프로그램 종료 <<");
				flag = false;
			} else {
				System.out.println(">> 잘못된 선택입니다 <<");
			}

		}

	}// end of main

	// 저장
	public static void save(Scanner sc, PhoneBook[] number) {
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String phonenumber = sc.nextLine();
		PhoneBook Phone = new PhoneBook(name, phonenumber);

		if (LAST_INDEX_NUMBER >= number.length) {
			System.out.println("더이상 전화번호를 저장할 공간이 없습니다. ");
			return;
		}
		for (int i = 0; i < number.length; i++) {
			if (number[i] == null) {
				number[i] = Phone;
				LAST_INDEX_NUMBER++;
				break;
			}
		}
		System.out.println("전화번호가 저장되었습니다. ");
	}

	// 전체 조회
	public static void readAll(PhoneBook[] number) {
		for (int i = 0; i < number.length; i++) {
			if (number[i] != null)
				System.out.println(number[i].getUserName() + " , " + number[i].getPhoneNumber());
		}
	}

	// 선택 조회
	public static void readByNumber(Scanner sc, PhoneBook[] number) {
		System.out.println(">> 이름을 입력해주세요 <<");
		String name = sc.nextLine();
		boolean isFind = false;

		for (int i = 0; i < number.length; i++) {
			if (number[i] != null) {
				if (number[i].getUserName().equals(name)) {
					System.out.println(number[i].getUserName() + " , " + number[i].getPhoneNumber());
					isFind = true;
					break;
				}
			}
		}
		if (isFind == false) {
			System.out.println("해당 이름은 존재하지 않습니다. ");
		}

	}

	// 수정
	public static void update(Scanner sc, PhoneBook[] number) {
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("변경할 전화번호를 입력하세요");
		String phonenumber = sc.nextLine();
		boolean isFind = false;

		for (int i = 0; i < number.length; i++) {
			if (number[i] != null) {
				if (number[i].getUserName().equals(name)) {
					number[i].setPhoneNumber(phonenumber);
					System.out.println(number[i].getUserName() + "의 전화번호가 " + phonenumber + "로 수정되었습니다.");
					isFind = true;
					break;
				}

			}
		}

		if (isFind == false) {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	// 전체 삭제
	public static void deleteAll(PhoneBook[] number) {
		for (int i = 0; i < number.length; i++) {
			number[i] = null;
		}
		System.out.println("전체 삭제되었습니다.");
	}

}// end of class
