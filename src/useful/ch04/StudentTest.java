package useful.ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student student = Student.getInstance(); // Student 클래스의 getInstance() 메서드 생성
		System.out.println(student); // student 출력 시 주소값 나옴.
		
		Student student2 = Student.getInstance();
		System.out.println(student2);// 같은 주소값 나옴.

	}

}
