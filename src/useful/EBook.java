package useful;

public class EBook {

	private int BookTypeId;
	private String title;
	private String author;

	public EBook(int BookTypeId, String title, String author) {
		this.BookTypeId = BookTypeId;
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return BookTypeId + "," + title + "," + author;
	}

	// Object 클래스에 있는 메서드를 재정의
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof EBook) {
//			// 1. EBook 클래스의 인스턴스가 맞다면
//			EBook tBook = (EBook)obj; // obj를 EBook으로 다운캐스팅함.
//			// 2. EBook 의 제목과 저자의 이름이 같다면 true 반환시켜라
//			if(this.title.equals(tBook.title)) {
//				return true;
//			}else {
//				
//				return false; // 그게 아니어도 반환된다.
//			}
//		}
//		return false; // 그게 아니어도 반환된다.
//	}

	public static void main(String[] args) {
		EBook book1 = new EBook(1, "홍길동전", "허균");
		EBook book2 = new EBook(1, "홍길동전", "허균");
		System.out.println("------------------------------------------------");

		boolean result1 = book1 == book2;
		System.out.println("result1 : " + result1);
		boolean result2 = book1.equals(book2);
		System.out.println("result2 : " + result2);
		
	
		
	}
}
