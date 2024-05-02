package basic.ch04;

public class WhileTest2 {

	//코드의 시작점(메인함수)
	public static void main(String[] args) {
		
		// 특정 조건일 때 반복문을 종료시켜보자.
		
		boolean flag = true; // 특정한 조건 반복 시 사용(깃발)(if문 자주 사용)
		int start = 1;
		int end = 3;
		
		while(flag) {
			
			if(start == end) {
				System.out.println("if 구문이 동작함");
				flag = false;
				return; //종료하고 싶을 때 사용
			}
			
			System.out.println("start : " + start);
			start++;
		}// end of while
		

	}// end of main

}// end of class
