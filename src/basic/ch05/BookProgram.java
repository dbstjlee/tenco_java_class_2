package basic.ch05;

public class BookProgram {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// Book 클래스를 인스턴스화 시켜주세요. 2개
		// 참조 타입 변수명은 bookBox1, bookBox2
		Book bookBox1 = new Book(); // 객체 생성
		Book bookBox2 = new Book(); // 객체 생성
		
		// 참조 타입에 변수 안에는 실제 값이 들어가는 것이 아니라
		// 주소값이 담긴다. 레퍼런스 변수(Reference variable)라고도 한다.
		
		System.out.println(bookBox1);
		System.out.println(bookBox2);
		
		// Heap 메모리에 생성된 객체에 접근해서
		// 그 해당 객체의 속성값을 넣어보자.
		
		bookBox1.title = "플러터UI실전";
		bookBox1.author = "김근호";
		bookBox1.publishYear = 2022;
		bookBox1.totalPage = 230;
		System.out.println("----------------------------");
		
		// 콘솔창에다가 해당 객체의 속성값(상태값)을 출력해보자.
		System.out.println(bookBox1.title);
		System.out.println(bookBox1.author);
		System.out.println(bookBox1.publishYear);
		System.out.println(bookBox1.totalPage);
		
		System.out.println("------------------------");
		// 연습문제
		// bookBox2 클래스 인스턴스에 접근해서 속성값을 대입하고 
		// 콘솔창 화면에 출력하시오.
		
		bookBox2.title = "Java";
		bookBox2.author = "사람 이름";
		bookBox2.publishYear = 2024;
		bookBox2.totalPage = 300;
		
		System.out.println(bookBox2.title);
		System.out.println(bookBox2.author);
		System.out.println(bookBox2.publishYear);
		System.out.println(bookBox2.totalPage);
		
		
		
	}// end of main

}// end of class
