package basic.ch15;

public class BookTest {

	public static void main(String[] args) {

		// 배열이란 - 연관된 데이터를 하나의 변수의 통으로 관리하고 싶다면 - 자료구조
		// 배열을 사용할 때 반드시 크기가 지정되어야 한다.
		Book[] books = new Book[10]; // 객체가 아니라 Book이라는 데이터 타입의 배열의 메모리 공간 선언

		books[0] = new Book("플러터UI실전", "김근호"); // 객체 생성
		books[1] = new Book("무궁화꽃이피었습니다", "김진명");
		books[2] = new Book("흐르는강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");
		books[9] = new Book("홍길동전", "허균");

		// 배열은 반복문과 함께 많이 활용된다.
		// 배열의 크기와 요소의 크기는 꼭 동일한 것은 아니다.

		// books[3] --> Book 이라는 객체로 볼 수 있음.
		System.out.println(books[3].getTitle()); // 객체 안에 들어가려면
		System.out.println(books[3].getAuthor());

		// System.out.println(books[5].getTitle()); <-- null pointer 에러뜸.(가리키는 주소가 없어 .
		// 연산자로 객체 안에 들어갈 수 없음)

		for (int i = 0; i < books.length; i++) {
			// books[0]. // 객체가 존재함.
			// books[1].
			// books[2].
			// books[3].
			// books[4].
			// books[5]. // 객체가 존재하지 않음. 즉, 가리키는 주소가 없음. null이라고 출력됨.

			// 방어적 코드를 작성해주어야 한다.
			if (books[i] != null) {
				System.out.println(books[i].getTitle());
				System.out.println(books[i].getAuthor());
				System.out.println("-------------------");
			}

		}

	}// end of main

}// end of class
