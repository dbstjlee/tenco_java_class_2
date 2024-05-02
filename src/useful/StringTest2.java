package useful;

public class StringTest2 {

	public static void main(String[] args) {

		String str3 = "abc";
		String str4 = "abc";
		System.out.println(System.identityHashCode(str3)); // 원시의 해시코드의 주소값을 코드를 출력해줌.
		System.out.println(System.identityHashCode(str4)); // 원래의 주소값이 출력됨.
		// 같은 주소 값이 출력됨.
		// String str5 = str3 + " : def ";

		str3 = str3 + " : def "; // 리터럴 타입으로 생성된 것은 불변이라서 새로 생성됨.
		// System.out.println(str3); // 똑같이 나옴.
		System.out.println(System.identityHashCode(str3)); // 주소값이 새로 생성됨.

		// 리터럴 타입으로 생성한 String 한번 생성하면 불변이다.

	}// end of main
}// end of class
