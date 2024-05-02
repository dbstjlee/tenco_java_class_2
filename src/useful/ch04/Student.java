package useful.ch04;

public class Student{
	
	private static Student student; //static -> 내부에서 객체 생성 및 주소값 할당
	
	private Student() {} //private 이라 외부에서 기본 생성자 호출 못 함.
	
	public static Student getInstance() { // 외부에서 접근 가능한 메서드 생성
		if(student == null) {
			student = new Student();// 내부에서 객체 생성함.
		}
		return student;
	}
	

}
