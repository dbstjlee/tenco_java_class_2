package useful.ch03;

public class Password {

	private String pwd;
	
	// getter
	public String getPwd() {
		return pwd;
	}
	// setter
	public void setPwd(String pwd) throws PasswordException {
		
		if(pwd == null) {
			throw new PasswordException("비밀번호는 null 값일 수 없습니다.");
			
		}
		if(pwd.length() < 5) {
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
		}
		// 정규 표현식을 활용할 수 있다.
		// true 이면 예외를 발생 시키는 코드
		// pwd --> abcd 만 넣으면 true 여서 예외를 발생 시키는 코드임
		// pwd --> acd!@dd -> false ->예외를 발생 안 함.
		// 사용자 한테 비밀번호 설정 시에 단 한글자라도 특수 문자를 포함 시켜야
		// 예외를 발생 안 하게 코드를 작성한 것
		// pwd <== a~z, A~Z ==> true
		// pwd <== a, 10, ! ==> false
		if(pwd.matches("[a-zA-Z]+")) { //pwd와 [] 문자를 match 
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		} // 여기 조건 만족 시 if 구문 수행됨.
		
		// [...] : 대괄호는 문자열을 나타냄
		// a-z, A-Z 모든 알파벳 문자열을 말한다.
		// + : 바로 앞의 표현식이 하나 이상은 반복되어야 한다.
		// 즉, "Hello", "world" --> true를 반환한다.
		// "A1", "bbb"(3글자) --> false
		this.pwd = pwd;
		
	}
}
