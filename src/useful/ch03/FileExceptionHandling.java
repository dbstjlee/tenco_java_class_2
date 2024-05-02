package useful.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	// 메인 쓰레드
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("demo.txt");
			return; // 더이상 코드가 안 내려 가지만 finally가 return 보다 더 세다. -> finally 만 출력됨
		} catch (FileNotFoundException e) {
			System.out.println("catch 구문 실행!!!");
			e.printStackTrace(); //printStackTrace 오류가 발생한 코드를 추적해줌.
			// FileNotFoundException 의 e 라는 녀석이 printStackTrace(추적해주는 시점)
		} finally {
			// 반드시 수행 되어야 하는 코드 영역
			// 심지어 return 키워드를 만나더라도 여기는 수행이 된다.
			System.out.println("finally 블록 수행");
			try {
				fis.close(); // 오류가 발생할 수 있고, 객체 생성 안 했는데 . 연산자, close 메소드 호출하고  쓰고 있어서 예외 처리함.
			} catch (IOException e) {
				e.printStackTrace();
			} //닫는 시점에 fis. <-- 객체가 생성 안 될 경우도 존재함 
			//finally 이기 때문에 반드시 close 하는 영역을 포함해야 함.
		}
		
		System.out.println("비정상 종료 되지 않았어요."); // return을 적으면 더이상 수행이 안 되지만 finally는 수행이 됨.
		
	}// end of main
} // end of class
