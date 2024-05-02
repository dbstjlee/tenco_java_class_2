package useful.ch03;

public class ThrowsHandling {

	// 메인 쓰레드
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		try {
			// 던져서 강제성이 발생이 되고
			// 사용하는 사람이 직접 예외 처리 핸들링을 할 수 있다. 
			calc.divide(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("어떤 수를 0으로 나눌 수 없어요.");
			//e.printStackTrace(); // Exception 최상위라 무조건 여기에 다 잡힘.
		} catch (Exception e) { // 앞에는 작은거 부터 넣고 마지막에 Exception 넣어야 함.
			System.out.println(e.getMessage()); // 어떤 예외가 발생 했는지 콘솔에 찍도록 해라.
		}

		Exception exception;
		
	}// end of main

}// end of class

class Calc { // public 사용 X (단 하나의 public 만 사용 가능)

	public int divide(int n1, int n2) throws Exception{
		// 사용자가 0을 입력하면 예외가 발생 될 수 있는 코드 영역이다.
		// 해결 방법
		// 1. 해당 메서드에서 직접 예외 처리를 구현한다.
		// 2. 사용하는 사람이 직접 예외 처리를 할 수 있도록 던져 버린다. // 쓰는 사람 마다 다르게 처리해야 할 때 throws
		return n1 / n2;
	}

}
