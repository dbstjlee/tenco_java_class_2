package Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		String[] sample = { "i", "walk", "the", "line" };

		// 정렬 알고리즘을 실행하기 위해 asList()를 이용하여 배열을 리스트로 변환한다.
		List<String> list = Arrays.asList(sample);

		// Collections 인터페이스가 가지고 있는 정적 메서드인 sort()를 호출하여 정렬을 수행한다.
		// Collections.sort(list);

		// 역순으로 정렬하고 싶다면
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
}
