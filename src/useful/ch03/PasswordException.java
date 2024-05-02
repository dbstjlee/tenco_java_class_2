package useful.ch03;

/**
 * 사용자 정의 예외 클래스 생성
 */
public class PasswordException extends RuntimeException { // 불법적인 잘못된 오류를 만났을 때 사용

	// RuntimeException으로 설정하기
	// IllegalArgumentException -> Exception으로 수정 (런타임(프레임워크가 다를때) -> 컴파일 시점에서 상속 받고 싶을 때)
	public PasswordException(String message) {
		super(message);
	}
	
	
}
