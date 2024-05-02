package basic.ch19;

import java.util.Iterator;

public class Classroom {

	private String className;
	private Student[] students; // 멤버변수 //Student를 담을 수 있는 메모리 공간
	private int studentCount; // 학생 수
	private final int MAX_STUDENDT = 30; // 상수를 선언// 최대 학생의 수는 30명

	public Classroom(String className) {
		this.className = className;
		students = new Student[MAX_STUDENDT]; // students 배열 안에 MAX_STUDENDT= 30 칸짜리의 공간이 형성됨.
		// students 객체가 아닌 배열임. // 여기 안에 students 라는 객체만 들어올 수 있음.
		this.studentCount = 0; // 학급의 학생 수는 0명
	}

	// 학생을 추가하는 메서드 만들기(메서드는 동사로 시작하는 것이 좋음)
	public void addStudent(Student student) {
		// 방어적 코드
		if (studentCount < MAX_STUDENDT) {
			students[studentCount] = student; // 치환한거임. Students 배열에 학생이라는 객체의 주소값이 들어감.
			// studentCount(인덱스) 가 0부터 들어가면 인덱스 0에 입력한 학생의 주소값이 채워짐.
			studentCount++; // 최대 학생 수 30보다 적으면 학생 수가 0부터 1씩 증가함.
		} else {
			System.out.println("정원 초과"); // 최대 학생 수가 30보다 크거나 같으면 출력됨
		}
	}

	// 학급에 속한 모든 학생 정보를 출력하는 기능
	public void showStudents() {
		for (int i = 0; i < students.length; i++) {
			// 방어적 코드(null 오류) 참조변수에 주소값을 안 넣었거나, 객체를 생성하지 않았을때 오류 발생
			// students[i] --> [객체의 주소값] --> heap 영역에 객체를 참조
			if (students[i] != null) {
				System.out.println("name : " + students[i].getName() + ", age : " + students[i].getAge());
			}
		}
	}
}
