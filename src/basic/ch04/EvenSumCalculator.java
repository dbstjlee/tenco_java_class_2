package basic.ch04;

import java.util.Scanner;

public class EvenSumCalculator {

	public static void main(String[] args) {

		// ctrl + shift + o 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력하세요 : ");
		//print : 한 줄 띄우지 마라는 의미
		int maxNumber = sc.nextInt();
		// 1 <---    10 ----> 2 + 4 + 6 + 8 + 10;
		int sum = 0;
		
		// 10
		// 반복적인 패턴이 확인된다.
		// 1 2 3 4 5 6 7 8 9 10; (10번 반복됨)
		// i = i + 2 --> i += 2
		for(int i = 2; i <= maxNumber; i += 2) {
			//1 =  0  + 1;
			//3 =  1  + 2;
			//6 =  3  + 3;
			sum = sum + i;
			
			// 10 입력 시 2+4+6+8+10 = 30
		}
		
		System.out.println("sum : " + sum);
		sc.close();
		
	}//end of main

}// end of class
