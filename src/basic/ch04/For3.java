package basic.ch04;

public class For3 {

	public static void main(String[] args) {

	
		int j;
		for (int i = 1; i <= 9; i++) {
			if (i % 2 != 0) {
				for (j = 1; j <= i; j++) {
					System.out.print("*");
					
				}
			}
			System.out.println();
		}
	}
}
