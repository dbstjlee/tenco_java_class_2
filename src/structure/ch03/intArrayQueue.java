package structure.ch03;

public class intArrayQueue {

	private int[] array;
	private int front; // 큐의 시작 지점
	private int rear; // 큐의 끝 지점
	private int capacity; // 큐의 용량
	private int size;// 요소의 개수

	public intArrayQueue(int capacity) {
		// 위 멤버 변수 중 초기화할 꺼 적기
		this.capacity = capacity;
		array = new int[this.capacity];
		this.front = 0; // 시작 지점은 0이다.
		this.rear = -1; // 맨 뒤에 아무것도 없다면 -1로 표시.
		this.size = 0;
	}

	// 편의 기능 만들어보기
	public boolean isEmpty() { // 관계연산이나 비교연산 쓰기
		return size == 0; // 비어있는 상태이다.
	}

	public boolean isFull() {
		return size == capacity; // 가득찬 상태이다.
	}

	// todo - 1 데이터 넣기 기능 구현
	public void enqueue(int item) { // 정수값을 배열로 관리하고 있음.
		if (isFull()) {
			System.out.println("큐 메모리 공간이 가득");
		} else {
			// rear = -1이라서 시작부터 ++ 해줌.
			rear++; // 0 <-- (첫 동작 시)
			array[rear] = item; // array[0] = item;
			size++; // 공간이 하나씩 채워짐.
		}

	}

	// todo - 2 데이터 꺼내기 // 매개변수 설계 없이 꺼내기만 함.
	public int dequeue() {
		int item = -9999;
		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없음");
		} else { // else 구문 통일성

			// 잠시 데이터 꺼내 보기
			item = array[front]; // 0번째 요소에 접근
			// 100, 200, 300
			// front = 0 (첫 꺼낼 시)
			for (int i = front; i < rear; i++) { // 0 < 2(0,1)
				// array[0] = array[1];
				// 200, 200, 300 -- for : 1번 동작
				// 200, 300, 300 -- for : 2번 동작
				array[i] = array[i + 1];
			}
			// 200, 300, 0
			// 마지막 요소를 초기화 처리한다.(꺼내서 한 칸씩 당김)
			array[rear] = 0; // 마지막에 0을 넣어줌.
			rear--; // 맨 뒤가 하나 줄었다
			size--; // 요소가 하나 없어짐

		}
		return item;// 맨 앞에 있는 요소를 리턴해줌
	}

	// todo - 3 데이터 찾기(peek)(삭제x)
	public int peek() { // 맨 앞에 보여져야 해서 매개변수 받을 필요 없음.
		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없습니다.");
			return -9999;
		} else {
			// peek --> 맨 앞에 데이터를 리턴시켜주는 기능일뿐
			//return array[0];
			return array[front];
		}
	}

	// 코드 테스트
	public static void main(String[] args) {

		intArrayQueue queue = new intArrayQueue(3);

		// 데이터 넣기
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400); // 메모리 공간 차서 안 들어감.

		// 데이터 꺼내고 삭제 처리
		// queue.dequeue(); // 맨 처음 들어온 녀석부터 꺼내지고 삭제 처리 된다.

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue()); // 더이상 메모리 공간에 요소가 없어서 -9999가 나옴.

	}// end of main

} // end of class
