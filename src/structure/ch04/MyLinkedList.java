package structure.ch04;

import java.util.LinkedList;

public class MyLinkedList {

	private Node head; // 포함관계 // 요소의 맨 처음을 가리킴.
	private int count; // 링크드 리스트에 몇개의 요소가 연결되어 있는 개수

	// MyLinkedList를 생성하면 맨 처음 생성 시 노드는 없는 상태이기 때문에 null임.
	public MyLinkedList() {
		head = null;
		count = 0;
	}

	// 기능
	// 저장된 Node의 개수를 반환하는 메서드 생성
	public int getCount() {
		return count;
	}

	// 새로운 Node 클래스를 1개 추가하는 메서드 생성
	public Node addElement(String data) {
		Node createNode = new Node(data); // 노트 객체 생성 시 데이터가 담길 수 있도록 생성

		if (head == null) {
			// 맨 처음 요소를 저장하는 동작
			// 항상 head 부터 찾아야 Linked list로 간다?고 함.
			head = createNode; // head 에 넣어주면 저장이 됨.
			// head에 들어가있음
			// 맨 처음 head를 지정해줌.
		} else {
			// 항상 요소 찾기는 head 부터 시작
			Node preNode = head;// 내가 찾을 데이터 타입: Node
			// [야스오][](next) =>null 이라 while 문 안 돌고 핵심 코드에 들어감
			// preNode.next //<--- Node를 가리킴 <-- 주소값이 없으면 null
			while (preNode.next != null) { // 다음 요소가 있는 것을 의미함
				preNode = preNode.next;
			}
			// 핵심 코드
			// 티모에 주소값이 담김
			// [티모][next] --> [next] = [소라카][] // next 요소에 소라카가 담겨 있음
			preNode.next = createNode;
		}
		count++; // 요소가 1개 증가함
		return createNode; 
	}

	public Node removeElement(int index) {
		// 방어적 코드
		// count는 인덱스 개념? 아무튼 index와 count 의 개념이 다름
		if (index >= count) { // 사용자가 요청한 인덱스 값이 존재하는 인덱스 개수보다 크거나 같을때
			System.out.println("삭제할 위치 오류. 현재 리스트 개수는 " + count + "입니다.");
			return null; // Node 데이터 타입이라서 null을 반환함
		}
		// 실행 시점 생각하기
		// 맨 앞 요소를 삭제 요청 시
		// 항상 요소를 찾을 때 시작은 head 부터 시작이다.
		// index: 사용자가 요청한 값
		Node tempNode = head;
		if (index == 0) { // 인덱스 0번(야스오)라면 
			// 코드 시작 전 모습
			// [야스오][티모.주소값(티모의 주소값)] --> [티모][null] (뒤에 요소가 없다면 null 임)
			head = tempNode.next; // 런타임 시점 // 다음 주소값을 head (야스오)에 담음.
			// 코드 수행 후 모습
			// [티모][null] // 뒤에 있는 티모를 head로 옮김.
		} else {
			// 코드 시작 전 모습 => index = 2 이라고 가정 ---> 인덱스 값은 n-1 이라서 1임.
			// 0 1 2
			// [야스오][티모.주소값] --> [티모][소라카.주소값] --> [소라카][null]
			// 링크를 제거하고 0의 주소값을 2라고 바꿔치기하기
			// 이 부분 그림 그려서 이해하기
			Node preNode = null;// 지역변수 선언 // preNode(head(0번째))에 null 잠시 담아두기. 그래야 찾아갈 수 있음.
			for (int i = 0; i < index; i++) {
				// 0, 1
				preNode = tempNode; // 0번째에 항상 head(=tempNode) 가 들어감. //head(=tempNode)를  prenode(null)에 담고(null <-- head 담기)
				tempNode = tempNode.next; // 다음(1번째)를 tempnode(head)에 담기(비어있는 head <-- 1번째 담기)
			}
			preNode.next = tempNode.next;// 반복문 끝나면 (null 다음꺼 <-- 1번째 담기)

		} // end of if
		count--; // 요소를 하나 삭제함.
		//System.out.println(position + "번째 요소를 삭제했습니다. ");

		// if 문 없으면 아무것도 없는 것과 마찬가지라서 return 값 넣기
		return tempNode; // 찾았던 tempNode를 리턴시킴
	}
	
	// 전체 출력하는 기능 만들기
	public void printAll() {
		if(count == 0) {
			System.out.println("출력할 내용이 없습니다. ");
			return;
		}
		Node temp = head; // 항상 head 부터 시작함.
		while(temp != null) {
			System.out.print(temp.getData());
			temp = temp.next; // 다음 요소를 담음
			if(temp != null) {
				System.out.print("-->");
			}
		}
		System.out.println();// 줄바꿈
	}
	
	// 지정한 위치의 노드 하나만 출력하기
	public Node getNodeByIndex(int index) { //index 를 받을 수 있게 설계
		if(index >= count) {
			System.out.println("검색 위치 요류 - 잘못된 요청");
		}
		Node tempNode = head; //-> 멤버 변수 선언해서 여기서 담고 활용하기
		if(index == 0) {
			return head; // 맨 처음이라는 것을 인지하기 위해 head 사용(tempNode 들어가도 무방함)
		}
		//  Node 에는 String data와 Node에는 다음 주소값이 담김
		// 다음 요소를 찾기 위해서는 .next (= 다음 요소)를 원래 요소에 담아줌.
		// [야스오][티모.주소값] ->[티모][] ->[소라카][]
		for(int i = 0; i < index; i++) {
			tempNode = tempNode.next; // 다음 요소는 무조건 next에 담겨 있다. 
			// 다음 요소를 tempNode 에 계속 담아 주기
		}
		return tempNode; // 지역 변수를 return시킴
	}
	
	// 전체 삭제 기능
	public void removeAll() {
		head = null;
		count = 0; // 상태값 관리하기
	}
	
	

	// 테스트 코드
	public static void main(String[] args) {

		MyLinkedList linkedList = new MyLinkedList(); // 메모리에 올림 //.연산자 사용 가능
		linkedList.addElement("야스오"); // head // 호출될 때 Node 클래스가 생성됨.
		linkedList.addElement("티모");
		linkedList.addElement("소라카");
		linkedList.addElement("애쉬");
		linkedList.addElement("가렌");

		
		linkedList.printAll();
		linkedList.removeElement(2);
		linkedList.printAll();
		// head
		// [야스오][]---->[티모][]---->[소라카][]
		// .연산자 사용x 객체를 사용해야 함.
		//System.out.println(linkedList.getCount()); // 저장된 노드의 개수 : 3개
		
		System.out.println(linkedList.getNodeByIndex(1).getData());// 주소.getData()
		linkedList.removeAll(); // heap 영역의 객체는 살아 있지만 link는 삭제해서 찾을 수 없음 
		//-> 가비지가 알아서 삭제
		linkedList.printAll();
	}// end of main

}// end of class
