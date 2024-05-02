package basic.ch07;

import java.util.Scanner;

public class User {

	String id;
	String password;
	String name;
	String gender;
	int age;

	// 패스워드 체크 기능 만들어 보기
	// 메서드의 함수는 동사로 시작하는 것이 권장 사항
	public boolean checkPassword(String inputPwd) {// () 여기에 외부의 값을 넣음//선언부
		// 만약 나의 멤버 변수에 들어가 있는
		// password 값과 외부에서 넣을 inputPwd 값이
		// 같다면 true 반환 아니면 false 반환하라
		// == : 주소값, 산술식에 사용함
		// 문자열 비교는 equals 라는 메서드를 사용한다.
		if (password.equals(inputPwd)) {
			return true;
		}
		return false;
	}

	// 독립적인 함수로서 여기서 실행 시킬 수 있다.
	public static void main(String[] args) {
		
		
		
		// User 클래스를 인스턴스화 시켜주세요
		User user1 = new User(); // heap 메모리 영역에 올라간다.
		user1.password = "123"; // 비밀번호가 123으로 덮어짐
		User user2 = new User();
		user2.password = "555"; 
		
		System.out.println("--------------------");
		
		//user1 pwd를 확인하고 싶다.
		//1
		Boolean user1Result = user1.checkPassword("333");// 메서드 호출 ()에 input 값 넣음
		System.out.println("user1 : " + user1Result);
		//2
		Boolean user1Result2 = user1.checkPassword("123");
		System.out.println("user1 두번째 결과 : " + user1Result2);
		
		System.out.println("-----------------");
		// 참조 변수 user2 기능인 checkPassword 호출해서 결과를 확인해주세요.
		// -- F -- 1
		// -- T -- 2
		
		Boolean user2Result = user2.checkPassword("111");
		System.out.println("user2 : " + user2Result);
		Boolean user2Result2 = user2.checkPassword("555");
		System.out.println("user2 두번째 결과 : " + user2Result2);
	}
		
		
		// 실행의 흐름을 만드는 방법(연습) -3
		// if 구문을 활용해서 콘솔창에 비밀번호가 틀렸습니다. 출력
		// 비밀번호가 맞습니다. 출력
	
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
	        
	   		Boolean checkPassword() {
			if ( i == 333) {
				System.out.println("비밀번호가 맞습니다.");
				return true;
			}
			System.out.println("비밀번호가 틀렸습니다.");
			return false;
	   		
		}
	




}// end of class
