package useful;

public class EBook2 {

	private int BookTypeId;
	private String title;
	private String author;

	public EBook2(int BookTypeId, String title, String author) {
		this.BookTypeId = BookTypeId;
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return BookTypeId + "," + title + "," + author;
	}

	// Object 클래스에 있는 메서드를 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof EBook2) {
			// 1. EBook 클래스의 인스턴스가 맞다면
			EBook2 tBook = (EBook2)obj; // obj를 EBook으로 다운캐스팅함.
			// 2. EBook 의 제목과 저자의 이름이 같다면 true 반환시켜라
			if(this.title.equals(tBook.title)) {
				return true;
			}else {
				
				return false; // 그게 아니어도 반환된다.
			}
		}
		return false; // 그게 아니어도 반환된다.
	}

	public static void main(String[] args) {
		Book myBook1 = new Book("흐르는강물처럼", "파울로코엘료");
		EBook2 book1 = new EBook2(1, "홍길동전", "허균");
		EBook2 book2 = new EBook2(1, "홍길동전", "허균");
		System.out.println("------------------------------------------------");

		if (book1.equals(myBook1)) {
			System.out.println("같은 주소를 가리킨다");
		} else {
			System.out.println("아니야 다른 주소야");
		}
		System.out.println(book1);
		System.out.println(book2);

	}
}
