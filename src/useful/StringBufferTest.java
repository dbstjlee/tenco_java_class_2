package useful;

public class StringBufferTest {

	//코드의 시작점 - (메인 작업자)
	public static void main(String[] args) {
		
		String str1 = new String("Hello");
		String str2 = new String("World");
		// heap 메모리에 객체를 2개 생성함.
		
		StringBuffer bufferStr = new StringBuffer("Hello");
		System.out.println(bufferStr);
		System.out.println(System.identityHashCode(bufferStr));// 원시 주소값
		
		bufferStr.append(str2); //"World" 대신에 변수(str) 입력 가능
		System.out.println(bufferStr);
		System.out.println(System.identityHashCode(bufferStr)); // 새로운 객체가 생성이 안 됨
		
		// 1번 결과와 2번 결과의 주소값이 같다는 의미는 새로운 메모리를 할당 한 것이 아닌 변경한 것이다.
		
		
		// 활용
		String newStr = bufferStr.toString(); // StringBuffer는 String 으로 변환하려면?? // 다운 캐스팅이 안 됨.
		// toString 호출 시 타입 --> String으로 변환됨.
		
		
		
		
		
		
	}// end of main
}// end of class
