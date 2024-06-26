package structure.ch03;

public class intArrayQueue2 {

	private int[] array;
	private int front; // 큐의 시작 지점
	private int rear; // 큐의 끝 지점
	private int capacity; // 큐의 용량
	private int size;// 요소의 개수

	public intArrayQueue2(int capacity) {
		// 위 멤버 변수 중 초기화할 꺼 적기
		this.capacity = capacity; // 큐의 용량 입력값
		array = new int[this.capacity]; // 입력된 큐의 용량 배열 객체를 array에 대입
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
		rear = (rear + 1) % capacity;
		// 나머지 연산자를 활용한다.(순환구조)
		// 예시
		// 1 = 1 % 5(용량) ; 몫 = 0 , 나머지 = 1
		// 2 = 2 % 5; 몫 0 , 나머지 2
		
		// array[0], array[1], array[2]  <--- [10][20][30]
		// 0 = 0     % 3 -> 1번째
		// 1 = 0 + 1 % 3 -> 2번째
		// 2 = 1 + 1 % 3 -> 3번째
		// 0 = 2 + 1 % 3 -> 4번째 => 여기서부터 덮어쓰기
		// 1 = 0 + 1 % 3 -> 5번째
		// 2 = 1 + 1 % 3 -> 6번째
		// 계속 덮어쓰기 하면서 순환구조
		
		array[rear] = item;
		// rear = (rear + 1) % capacity;
		// rear = 0부터 시작
		// array[0] = 10; => 첫번째 순환: array[0]에 item 값 10이 담김
		// array[1] = 20;
		// array[2] = 30;
		// array[0] = 10; => 덮어쓰기
		size++; // 요소가 하나 증가함.
		//front는 사용 안 해서 계속 0인 상태
	}

	// todo - 2 데이터 꺼내기 (삭제하지 않고 덮어쓰기)
	// 꺼내기만 해서 매개변수 설계X
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -9999;
		}
		//  비어있지 않다면 
		int item = array[front]; 
		// array[0]이 item에 담김
		// capacity가 4라고 가정 
		//[10][20][30]
		// 1 = 0 + 1 % 4 -> array[0] = 10
		// 2 = 1 + 1 % 4 -> array[1] = 20
		// 3 = 2 + 1 % 4 -> array[3] = 30
		// 1 = 3 + 1 % 4 -> array[0] = 10 => 덮어쓰기
		front = (front + 1) % capacity;// 순환구조
		return item;
	}
	// 데이터 요소 전체 출력
	public void printAll() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// todo - 3 데이터 찾기(peek)(삭제x)
	public int peek() { // 맨 앞에 보여져야 해서 매개변수 받을 필요 없음.
		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없습니다.");
			return -9999;
		} else {
			// peek --> 맨 앞에 데이터를 리턴시켜주는 기능일뿐
			// return array[0];
			return array[front];
		}
	}


	// 코드 테스트
	public static void main(String[] args) {

		intArrayQueue2 queue = new intArrayQueue2(4); // 큐의 용량: 4

		// 데이터 넣기
		queue.enqueue(10); //0
		queue.enqueue(20); //1
		queue.enqueue(30); //2
		// 인덱스 3인 4번째 큐 데이터가 없으므로 0이 들어감.
		
		System.out.println(queue.dequeue()); // 제일 먼저 들어가 있던 10이 호출됨.
		System.out.println(queue.dequeue()); 
		System.out.println(queue.dequeue()); 
		System.out.println(queue.dequeue()); // 0이 출력됨.
		System.out.println(queue.dequeue()); // 10이 순환되어 출력됨.

		queue.printAll(); // 출력: 10 20 30 0 
	}// end of main
} // end of class
