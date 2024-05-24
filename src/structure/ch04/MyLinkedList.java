package structure.ch04;

import java.util.LinkedList;

public class MyLinkedList {

	private Node head; // 포함관계 // 요소의 맨 처음을 가리킴.
	// Node의 데이터와 주소값이 담겨있다고 생각하기
	private int count; // Linked List에 몇개의 요소가 연결되어 있는 개수

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
		// if문: 인덱스 0: addElement("야스오") => 야스오가 createNode에 담김
		// else문: 인덱스 1: addElement("티모")
		if (head == null) {
			// 맨 처음 요소를 저장하는 동작(맨 처음 head를 지정)
			// 항상 head부터 찾아야한다.
			head = createNode; // head에 넣어주면 저장이 됨.
			// head가 null이어서 createNode에 담겨있던 야스오가 head에 들어감.
		} else {
			// 1) head에는 야스오가 담겨있고, 티모가 추가되는 상황(while문X)
			// 항상 요소 찾기는 head부터 시작
			Node preNode = head;// 내가 찾을 데이터 타입: Node
			// head에 담겨있던 야스오를 preNode에 담아둠.
			// preNode = [야스오][null]

			// 2) head에는 야스오가 담겨있고, 티모가 있고 소라카가 추가되는 상황(while문O)
			// [야스오][티모.주소값], [티모][null]
			// preNode = 야스오 preNode.next = 티모
			while (preNode.next != null) { // 다음 요소가 있을때
				preNode = preNode.next; // 티모가 preNode에 담김
				// preNode = 티모
			}
			// 1) [야스오][null] => preNode.next가 null이라 while문 안 돌고 핵심 코드에 들어감
			// 핵심 코드
			preNode.next = createNode; // createNode에 담겨있는 티모가 preNode.next에 담김
			// [야스오][티모.주소값] --> [티모][null] (뒤에 요소가 없다면 null 임)
			
			// 2) preNode = 티모
			// createNode에 담긴 소라카가 preNode.next에 담김
			// [티모][소라카.주소값] --> [소라카][null] => 소라카가 추가됨

		}
		count++; // 요소가 1개 증가함(티모가 추가됨)
		return createNode; 
		// 1) 티모가 반환됨.
		// 출력: [야스오][티모.주소값] --> [티모][null]
		// 2) 소라카가 반환됨.
		// 출력: [야스오][티모.주소값] --> [티모][소라카.주소값]--> [소라카][null]
	}

	// 노드를 1개 제거하는 메서드
	//코드 수행 전
	// [야스오][티모.주소값] --> [티모][소라카.주소값] --> [소라카][애쉬.주소값] -->[애쉬][null]
	public Node removeElement(int index) {
		// 방어적 코드
		// index: 사용자가 요청한 값
		// count는 인덱스 개념 (index와 count의 개념이 다름)
		if (index >= count) { // 사용자가 요청한 값(인덱스)이, 존재하는 인덱스 개수(count)보다 크거나 같을때
			System.out.println("삭제할 위치 오류. 현재 리스트 개수는 " + count + "입니다.");
			return null; // 리턴 타입인 Node가 데이터 타입이라서 null을 반환함
		}
		// 맨 앞 요소를 삭제 요청 시
		// 항상 요소를 찾을 때 시작은 head 부터 시작이다.
		Node tempNode = head;
		// head에 담긴 야스오를 tempNode에 담는다.
		if (index == 0) { // 인덱스 0번(야스오)라면
			// 코드 시작 전 모습
			// [야스오][티모.주소값] --> [티모][소라카.주소값] --> [소라카][애쉬.주소값] -->[애쉬][null]
			head = tempNode.next; // 런타임 시점 // tempNode.next(티모)를 비어있는 head에 담음.
			// 출력은 head부터 됨. tempNode에 담아놓은 야스오는 출력되지 않음.
			// 출력: [티모][소라카.주소값] --> [소라카][애쉬.주소값] -->[애쉬][null](head 였던 야스오가 삭제됨)
		} else {
			// 코드 시작 전 모습 => index = 2 이라고 가정 ---> 인덱스 값은 n-1 이라서 1임.
			// 0 1 2
			// [야스오][티모.주소값] --> [티모][소라카.주소값] --> [소라카][애쉬.주소값] -->[애쉬][null] (소라카 삭제가 목적)
			Node preNode = null;// 지역변수 선언 // preNode에 null 잠시 담아두기. 그래야 찾아갈 수 있음.
			for (int i = 0; i < index; i++) {
				// index = 2

				// 0
				preNode = tempNode; // 0번째에 항상 head가 들어감.
				// 야스오가 담겨있는 tempNode(head)를 preNode(null)에 담기
				tempNode = tempNode.next; // 다음 요소(티모)를 비어있는 tempNode에 담기
				// preNode = 야스오 tempNode = 티모

				// 1
				// preNode = tempNode; // 야스오가 담겨있는 preNode에 티모가 담겨있는 tempNode를 담음
				// tempNode = tempNode.next; // 다음 요소(소라카)를 비어있는 tempNode에 담기
				// preNode = 티모 tempNode = 소라카

			}
			// 반복문 끝나면
			// preNode = 티모 tempNode = 소라카
			// preNode.next = 소라카 tempNode.next = 애쉬
			preNode.next = tempNode.next;// 애쉬의 주소값을 소라카의 주소값에 담기
			// [티모][소라카.주소값] --> [소라카][애쉬.주소값]-->[애쉬][null]
			// [소라카.주소값] <-- [애쉬.주소값]
			// [티모][애쉬.주소값]-->[애쉬][null] => 초점만 여기일 뿐 야스오를 삭제한 것이 아님.
			// 출력: [야스오][티모.주소값]-->[티모][애쉬.주소값]-->[애쉬][null]

		} // end of if
		count--; // 요소를 하나 삭제함.
		// System.out.println(position + "번째 요소를 삭제했습니다.");

		// if 문 없으면 아무것도 없는 것과 마찬가지라서 return 값 넣기
		return tempNode; // [티모][소라카] => 삭제된 소라카가 반환됨.
	}

	// 전체 출력하는 기능 만들기
	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		Node temp = head; // 항상 head 부터 시작함.
		while (temp != null) {
			System.out.print(temp.getData()); // head가 null이 아니면 data가 출력
			temp = temp.next; // 다음 요소를 앞의 요소로 반복해서 당김.
			if (temp != null) {
				System.out.print("-->");
			}
		}
		System.out.println();// 줄바꿈
	}

	// 지정한 위치의 노드 하나만 출력하기
	public Node getNodeByIndex(int index) { // index 를 받을 수 있게 설계
		if (index >= count) {
			System.out.println("검색 위치 오류 - 잘못된 요청");
		}
		Node tempNode = head; // -> 멤버 변수 선언해서 여기서 담고 활용하기
		// head(야스오)를 tempNode에 담음
		if (index == 0) {
			return head; // 맨 처음이라는 것을 인지하기 위해 head 사용(tempNode 들어가도 무방함)
		}
		// Node에는 String data와 다음 주소값이 담김
		// 다음 요소를 찾기 위해서는 .next (= 다음 요소)를 원래 요소에 담아줌.
		// [야스오][티모.주소값] ->[티모][애쉬.주소값] ->[애쉬][null]
		for (int i = 0; i < index; i++) {
			// index가 2라면
			tempNode = tempNode.next; // 다음 요소는 무조건 next에 담겨 있다.
			// 다음 요소를 tempNode에 계속 담아 주기
			// tempNode: 야스오 tempNode.next: 티모
			// => 티모가 tempNode에 담김

			// 1
			// tempNode = tempNode.next;
			// tempNode: 티모 tempNode.next: 애쉬
			// => 애쉬가 tempNode에 담김
		}
		return tempNode; // 애쉬를 반환시킴
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
//		linkedList.addElement("가렌");

		linkedList.printAll();

		linkedList.removeElement(2); // 인덱스 2번 => 세 번째인 소라카가 삭제됨.
		// [야스오][]---->[티모][]---->[애쉬][]
		// linkedList.addElement("소라카");// 삭제한 소라카를 다시 추가하면 맨 뒤에 추가됨.
		linkedList.printAll();

		// .연산자 사용x. 객체를 사용해야 함.
		System.out.println(linkedList.getCount()); // 저장된 노드의 개수 : 4개(5개 중 1개 삭제)
		System.out.println(linkedList.getNodeByIndex(2).getData());// 주소.getData() // 인덱스 2번 :애쉬
		linkedList.removeAll(); // heap 영역의 객체는 살아있지만 link는 삭제해서 찾을 수 없음
		// -> 가비지가 알아서 삭제
		linkedList.printAll();
	}// end of main
}// end of class
