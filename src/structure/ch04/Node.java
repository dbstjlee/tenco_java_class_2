package structure.ch04;

public class Node {

	private String data; // String 이라 "A"라는 데이터가 담길 수 있음
	public Node next;
	// 자기 자신의 데이터 타입을 가짐(자기 참조 관계)(셀프 참조)
	// 정의 : 자기 참조는 객체가 자신과 같은 타입의 다른 객체를 가리키는 경우를 말한다.
	// 용도 : 연결 리스트, 트리 구조에 많이 활용

	// 기본 생성자
	public Node() {
		data = null;
		next = null; // Node를 가리킴
	}

	public Node(String data) {
		this.data = data;
		next = null; // 처음 생성되는 거라 null
	}

	public Node(String data, Node link) {
		this.data = data;
		next = link; // 같은 데이터 타입이라 link를 받을 수 있음
	}

	// getter
	public String getData() {
		return data;
	}
}
