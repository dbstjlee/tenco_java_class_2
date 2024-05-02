package useful.ch04;

public class CompanyTest {

	public static void main(String[] args) {

		// 싱클톤 패턴: 객체가 단 하나일때 존재하는 것

		// company 객체를 어떻게 접근 할 수 있을까?

		// 생성 불가
		// Company company = new Company();

		// A 클래스에서 활용
		Company company = Company.getInstance();
		System.out.println(company);

		// B 클래스에서 활용
		Company company2 = Company.getInstance();
		System.out.println(company2);

	}// end of main

}// end of class
