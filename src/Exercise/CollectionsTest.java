package Exercise;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("김철수");
		list.add("김영희");
		//Collections.sort(list); // 리스트 안의 문자열이 정렬된다.
		System.out.println(list);
	}

}
