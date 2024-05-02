package basic.ch06;

public class ex1 {

	public static void main(String[] args) {

		System.out.println(square(5));

		greet("이윤서");

		System.out.println(checkAdult(18));

		signOfNumber(1);

		System.out.println(findMax(5, 10));
	}

	static int square(int n1) {
		int sum;
		sum = n1 * n1;
		return sum;
	}

	static void greet(String greeting) {
		System.out.println("안녕하세요," + greeting + "님!");
	}

	static boolean checkAdult(int age) {
		boolean result = age >= 18;
		return result;
	}

	static void signOfNumber(int n3) {
		if (n3 < 0) {
			System.out.println("negative");
		} else if (n3 > 0) {
			System.out.println("positive");
		} else if (n3 == 0) {
			System.out.println("zero");
		}
	}

	static int findMax(int n4, int n5) {
		int num = (n4 > n5) ? n4 : n5;
		return num;
	}

}