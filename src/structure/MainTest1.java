package structure;

public class MainTest1 {

	public static void main(String[] args) {
		TencoIntArray tencoIntArray = new TencoIntArray();
		tencoIntArray.addElement(100);
		tencoIntArray.addElement(200);
		tencoIntArray.addElement(300);
		tencoIntArray.addElement(400);
		//tencoIntArray.insertElement(5, 50); // 테스트 이후에 수정 - todo
		
//		System.out.println(tencoIntArray.getElement(0));
		tencoIntArray.printAll(); // int 초기값 = 0 출력됨
		System.out.println("------------------------------");
		System.out.println(tencoIntArray.getCountSize()); // count 요소값 4개 출력
		System.out.println("------------------------------");
		System.out.println(tencoIntArray.isEmpty()); // 비어 있지 않아서 false 출력
		System.out.println("------------------------------");
		tencoIntArray.removeAll(); // 전부 삭제
		tencoIntArray.printAll(); // 다시 출력
	}

}
