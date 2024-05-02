package basic.ch14;

public class ArrayTest4 {

	public static void main(String[] args) {

		String[] arrayStr = new String[26]; // 26 번 반복됨.

		arrayStr[0] = "A";
		arrayStr[1] = "B";
		arrayStr[2] = "C";
		arrayStr[3] = "D"; 
		arrayStr[3] = "E"; // => 덮어쓰기

		arrayStr[25] = "Y"; // -> 요소의 개수가 5개 나와야 함.

		System.out.println(arrayStr[4]); // -> 값이 없어서 null을 출력함.

		// 배열 안에 요소의 개수를 출력하시오.
		// 값이 있다면 콘솔창에 출력
		// 반복문 활용

		int eCount = 0;
		for (int i = 0; i < arrayStr.length; i++) {
			if (arrayStr[i] != null) {
				// 요소의 개수 저장
				eCount++;
				System.out.println(arrayStr[i]);
			} // 만약 arrayStr[요소] 가 null이 아니라면(요소가 있다는 의미) 하나씩 증가해서 작동하는 요소의 개수가 출력됨.
		}
		System.out.println("배열 안의 요소의 개수는 ? " + eCount);
	}

}
