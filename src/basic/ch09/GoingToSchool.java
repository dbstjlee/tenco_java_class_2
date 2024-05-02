package basic.ch09;

public class GoingToSchool {

	public static void main(String[] args) {

		// 객체지향 프로그래밍이란 객체와 객체 간의 관계를 형성하고 
		// 상호작용하게 프로그래밍 하는 것
		
		Bus bus1 = new Bus(100); // 버스 타입의 버스 1은 100번 버스다.
		Bus bus2 = new Bus(200); // 버스2는 200번 버스다.
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Subway subway3 = new Subway(3);
		
		// 집중!
		Student student1 = new Student("홍길동", 10_000); // new Student(생성자)를 통해 Student 타일로 이동함.
		student1.showInfo();
		
		// 학생이 버스를 탄다
		System.out.println("----------------------");
		student1.takeBus(bus2);
		student1.showInfo();
		// 버스의 상태값을 확인해보자.
		System.out.println("----------------");
		bus2.showInfo();
		System.out.println("----------------");
		student1.takeSubway(subway1);
		student1.showInfo();
		subway1.showInfo();
		System.out.println("-----------------");
		subway2.showInfo();
		
	}//end of main

}// end of class
