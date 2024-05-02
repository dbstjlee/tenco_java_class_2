package basic.ch15;

import java.util.Scanner;

/**
 * author - 작성자 모든 프로그래밍의 기본은 C R U D 이다.
 */
public class MyBookStore {
	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		// 준비물
		Scanner sc = new Scanner(System.in);
		// 배열선언
		Book[] books = new Book[100];

		// 샘플 데이터 만들어 놓기
		books[0] = new Book("플러터UI실전", "김근호");
		books[1] = new Book("무궁화꽃이피었습니다", "김진명");
		books[2] = new Book("흐르는강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");
		LAST_INDEX_NUMBER = 5; // 배열의 요소 개수를 5라고 초기화함.

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";
		// 특정 시점 제어
		boolean flag = true;

		while (flag) {
			System.out.println("** 메뉴 선택 **");
			System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 0.프로그램 종료");
			// 문자열 + 다음줄로 이동 처리
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(SAVE)) {
				System.out.println(">> 저장 하기 <<");
				// 배열 안에 객체 생성하면 되는데 길어져서 함수 활용
				save(sc, books);

			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">> 전체 조회 하기 <<");
				readAll(books);

			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">> 선택 조회 하기 <<");
				readByTitle(sc, books);

			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">> 전체 삭제 하기 <<");
				deleteAll(books); // books라는 배열을 통으로 넘김.

			} else if (selectedNumber.equals(END)) {
				System.out.println(">> 프로그램 종료 <<");
				flag = false;
			} else {
				System.out.println(">> 잘못된 선택입니다.  <<");

			}
			// 문자열 비교 .equals

		}
	}// end of main

	// 함수의 활용
	//  전체 조회하기 
	public static void readAll(Book[] books) {
		System.out.println("----전체 조회하기----");
//		if(books.length <= 0) {
//			System.out.println("책이 하나도 없습니다. ");
//		} // -> 일단 pass
		for (int i = 0; i < books.length; i++) {
			// 방어적 코드 작성
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + " , " + books[i].getAuthor());

			} // books의 i 번째 객체가 not null이라면 i 번째의 제목과 저자를 출력하라는 의미

		}
	}

	// 전체 삭제하기
	public static void deleteAll(Book[] books) {
		System.out.println("----전체 삭제하기----");
		for (int i = 0; i < books.length; i++) {
			// Object --> null을 넣어주면 삭제가 됨.
			books[i] = null;
		}
		// Book[] 배열

	}

	// 저장하기(하나의 북 객체를 저장)
	// 저장하는 기능을 만들기 위해 키보드에 값을 입력하는 기능이 필요함.
	// heap 메모리에 접근하기 위해 주소값을 알아야 함.
	public static void save(Scanner sc, Book[] books) {
		System.out.println("----저장하기----");
		System.out.println("책의 제목을 입력하세요");
		String bookTitle = sc.nextLine();// 키보드를 입력하기 전까지 여기서 멈추게 됨. // bookTitle 메모리 공간에 담아둠.
		System.out.println("책의 저자를 입력하세요");
		String bookAuthor = sc.nextLine();
		Book book = new Book(bookTitle, bookAuthor); // 위의 메모리 공간(변수)으로 객체 생성함.

		if (LAST_INDEX_NUMBER >= books.length) {
			System.out.println("더이상 책을 저장할 공간이 없습니다.");
			return; // 코드가 더 이상 안 내려 가게끔 함.
		}

		// [0] <---
		// [1] <---
		// [2] <---
		// [3] <--- null = new Book(bookTitle, bookAuthor) 이라면 저장
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book; // Book book = new Book(bookTitle, bookAuthor); 생성한 객체의 형태로 저장
				LAST_INDEX_NUMBER++; // 요소의 개수로 사용해보자 = LAST_INDEX_NUMBER = 5; (5개)
				break;// 무시하고 멈춤
			}
		}
		System.out.println("책이 저장되었습니다. ");
	}

	// 만약 사용자가 입력한 책 제목과 배열 요소 안에 title 값이 같다면
	// 화면에 책 제목, 책 저자명을 출력하고
	// 아니라면 해당하는 책이 없습니다 . 문구를 출력하시오.

	// 심화 -- 반복문을 전부 돌리면 안됩니다.

	// 사용자가 입력한 값으로 조회
	// 사용자가 입력한 책 제목
	// books 전부 조사 - books[0] -> 존재하는 객체 자체를 나타냄 -> 객체.getTitle()과 비교
	// 문자열 --> equals
	// books[0].getTitle().equals() // 배열 안에 객체가 없다면 -> null pointer -> 방어적 코드 작성하기

	// 선택조회
	public static void readByTitle(Scanner sc, Book[] books) {// book 객체의 주소
		System.out.println("----선택 조회 하기----");
		System.out.println(">>> 책 제목을 입력해주세요 <<<");
		String bookTitle = sc.nextLine();
		boolean isFind = false;

		for (int i = 0; i < books.length; i++) {
			// 방어적 코드 작성
			if (books[i] != null) {
				if (books[i].getTitle().equals(bookTitle)) {
					System.out.println(books[i].getTitle() + " , " + books[i].getAuthor());
					isFind = true; // 책을 찾았으니 true임. 
					break; // 무시하고 멈춤
				}

			}
		}

		// 만약 선택된 값이 없다면
		// 해당 제목에 책은 존재하지 않습니다.

		if (isFind == false) {
			System.out.println("해당 제목의 책은 존재하지 않습니다. ");
		}

	}

}// end of class
