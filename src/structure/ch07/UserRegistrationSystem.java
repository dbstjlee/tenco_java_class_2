package structure.ch07;

import java.util.LinkedHashMap;
import java.util.Map;

import basic.ch07.User;

// alt + shift + r : 클래스명 변경
public class UserRegistrationSystem {

	private Map<String, User> users = new LinkedHashMap<>();

	// 정적 내부 클래스 => 왜 썼는지 알아보기
	static class User {
		String name;
		String email;

		public User(String name, String email) {
			this.name = name;
			this.email = email;
		}

		public String toString() {
			return "이름 : " + name + ", 이메일 : " + email;
		}

	} // end of inner User class

	// 사용자 등록 기능
	public void addUser(String name, String email) {
		// key, value(User)
		users.put(email, new User(name, email)); // 익명 클래스로 여기에 객체를 생성함.
		// email 넣는 순간에 객체 생성됨
	}

	// 사용자들 출력 기능
	public void displayUsers() {
		// values() => 한번에 key 말고 value 를 리턴하는 메서드
		for (User user : users.values()) {
			System.out.println(user);
		}
	}

	// 코드 테스트(메인 함수)
	public static void main(String[] args) {

		UserRegistrationSystem system = new UserRegistrationSystem();
		// 스캐너
		User user1 = new User("홍길동1", "a@naver.com");
		User user2 = new User("홍길동2", "b@naver.com");
		User user3 = new User("홍길동3", "c@naver.com");

		system.addUser(user1.name, user1.email);
		system.addUser(user2.name, user2.email);
		system.addUser(user3.name, user3.email);

		// Map 구조는 기본적으로 순서를 보장하지 않지만 LinkedHashMap을 사용해서 해결
		// 가입한 순서대로 출력하는지 확인

		system.displayUsers();

	}

}
