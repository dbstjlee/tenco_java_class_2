package basic.exercise;

import java.util.Scanner;

public class Exercise4 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 사용자한테 값을 입력 받기
		Scanner sc = new Scanner(System.in);
		int choice;
		// 만약 사용자가 1을 선택함.
		// System.out.println("등록을 선택했습니다.");

		// \n --> 시작할 때 무조건 한 줄 내림
		// for문은 반복 횟수가 정해졌을 때 사용함.
		// while 문은 특정 조건을 만날때 반복문을 종료가 되어야 할때 사용함.

		boolean flag = true;
		while (flag) {
			System.out.println("\n메뉴 선택");
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
			System.out.print("선택 : ");
			choice = sc.nextInt(); // choice 변수에 사용자가 입력한 값을 받아줌

			if (choice == 0) {
				System.out.println("프로그램을 종료합니다.");
			} else if (choice == 1) {
				System.out.println("등록을 선택했습니다.");
			} else if (choice == 2) {
				System.out.println("조회를 시작합니다.");
			} else if (choice == 3) {
				System.out.println("수정을 실행합니다.");
			} else if (choice == 4) {
				System.out.println("삭제가 완료되었습니다.");
			} else {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
			}
		}
		sc.close();
	}// end of main
}// end of class
