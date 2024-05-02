package basic.ch04;

public class For4 {

	public static void main(String[] args) {

	
		int j;
		for (int i = 1; i <= 4; i++) {
				for (j = 4; j >= i; j--) {
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
