package basic.ch09;

public class Student {
	
	String name;
	int money;// 소지금
	
	// 아래 코드를 만듦으로 인해 컴파일러가 기본 생성자를 안 만들어줌.
	public Student(String myName, int myMoney) {
		name = myName;
		money = myMoney;
	}
	
	// 학생이 버스를 탄다.
	public void takeBus(Bus bus) {
	// Bus는 우리가 만드는 데이터 타입
		// 어떻게 코드를 만들어야 할까?
		bus.take(1500); //. 연산자로 호출하고
		money = money - 1500;
	}
	// 학생이 지하철을 탄다.
	public void takeSubway(Subway subway) {
		subway.take(2000);
		money = money - 2000;
	}
	// 상태창을 보여준다.
	public void showInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 소지금 :" + money);
	}
	
	// 학생이 지하철은 탄다.
	
	// 상태창을 보여 준다.
}
