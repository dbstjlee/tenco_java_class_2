package basic.exercise;

import java.util.Scanner;

public class IfExercise1 {

	public static void main(String[] args) {

		System.out.println("성적을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt(); // 정수 입력받기
		System.out.println("로깅 - 받은 값 확인: " + point);

		if (point >= 90) {
			System.out.println("A 학점 입니다.");
		} else if (point >= 80) {
			System.out.println("B 학점 입니다.");
		} else if (point >= 70) {
			System.out.println("C 학점 입니다.");
		} else if (point >= 60) {
			System.out.println("D 학점 입니다.");
		} else {
			System.out.println("F 학점 입니다.");
		}
		sc.close();// 열여 있던 자원 닫기
	}// end of main
}// end of class
