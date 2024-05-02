package useful;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		// heap 메모리에 주소값 2개 올라감.
		
		System.out.println(str1 == str2); //false
		
		//리터럴 방식으로 선언
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); // 불변(리터럴 방식으로 선언해서)
		//true --> 리터럴 방식으로 선언해서 String pool 영역에 올라감.
		// 상수 풀에 올라간 String 값은 먼저 존재하는지 확인부터 한다.
		
		//완전 똑같은 문자열 abc가 존재 한다면 새로 생성하지 않고 다시 재사용한다.(메모리 절약을 위해)
		
		// == --> 객체의 주소값을 비교하는 녀석(참조타입 같은 경우)
		// equals 는 문자열 값을 비교하는 녀석
		// 결론적으로 문자열 비교는 논리적인 판단으로 같은지 다른지 true, false 값을 반환합니다.
		
		System.out.println(str1 == str4); // false --> 주소값을 비교함
		System.out.println(str1.equals(str4));// true --> 문자열 값(abc)을 비교함.
		
		
	}//end of main
}// end of class
