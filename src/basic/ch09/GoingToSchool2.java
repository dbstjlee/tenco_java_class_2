package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {

	public static void main(String[] args) {

		// 설계된 클래스를 가지고 본인이 의도한 대로 실행의 흐름을 만들어보자.

		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();

		// 스캐너를 활용해서 사용자가 1번을 누르면 버스에 태워서 실행의 흐름을 만들기
		// 2번을 누르면 지하철을 태우는 실행의 흐름을 만들자.
		Bus bus1 = new Bus(100); // 선언만 했음
		Bus bus2 = new Bus(100); // 선언만 했음
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(1);
		Student s1 = new Student("티모", 100_000);
		Student s2 = new Student("야스오", 100_000);

		System.out.println("------------------");
		if (button == 1) {
			s1.takeBus(bus1);
			s1.showInfo();
		} else if (button == 2) {
			s1.takeSubway(subway1);
			s1.showInfo();
		}

	}// end of main

}// end of class
