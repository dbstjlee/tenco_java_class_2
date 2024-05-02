package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator {

	public static void main(String[] args) {
		//사용자의 입력값을 받아서 1 부터 x 까지 숫자에 홀수를 덧셈하고 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력하시오 :");
		int maxNumber = sc.nextInt();
		int sum = 1;
		for(int i = 1; i <= maxNumber; i +=2) {
			sum += i;
			System.out.println("sum :" + sum + "\n");
		}
		System.out.println("sum :" + sum);
		//1+3+5+7+9
		sc.close();
	}// end of main

}// end of class
