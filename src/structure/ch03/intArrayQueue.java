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
		array = new int[this.capacity]; // in[초기화된 큐의 용량]의 객체(배열)을 생성한 것을 array에 담음 
		this.front = 0; // 시작 지점은 0이다.
		this.rear = -1; // 맨 뒤에 아무것도 없다면 -1로 표시.
		this.size = 0;
	}

	// 편의 기능 만들어보기
	public boolean isEmpty() { // 관계연산이나 비교연산 쓰기
		return size == 0; // 비어있는 상태이다.(요소 개수: 0)
	}

	public boolean isFull() {
		return size == capacity; // 가득찬 상태이다.(요소 개수 = 용량)
	}

	// todo - 1 데이터 넣기
	public void enqueue(int item) { // 정수값을 배열로 관리하고 있음.
		if (isFull()) {
			System.out.println("큐 메모리 공간이 가득");
		} else {
			// rear는 아무것도 없는 상태(-1)임. 
			// 뒤에서부터 추가됨으로 ++ 해줌.
			rear++; // 0 <-- (첫 동작 시)
			array[rear] = item; // 넣은 데이터(item)이 array[0]에 담김
			size++; // 공간이 하나씩 채워짐.
		}
	}

	// todo - 2 데이터 꺼내기(삭제하지 않고 덮어쓰기)
	// 꺼내기만 해서 매개변수 설계X
	public int dequeue() {
		int item = -9999;
		if (isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없음");
		} else {
			item = array[front]; // 0번째 요소(젤 처음에 삽입된 데이터)를 item에 담아둠.
			// 100, 200, 300
			// front = 0 (처음으로 꺼낼 시)
			for (int i = front; i < rear; i++) { 
				// rear(끝지점) = 2 (0,1,2 => 3개)
				// 0,1
				array[i] = array[i + 1];
				// 0
				// array[0] = array[1]; => [1]의 데이터(200)가 (100이 담겨있던)[0]에 담김(덮어쓰기)
				// 200, 200, 300
				
				// 1
				//array[1] = array[2]; =>  [2]의 데이터(300)가 (200이 담겨있던)[1]에 담김
				// 200, 300, 300
			}
			// 마지막 요소를 초기화 처리하기(꺼내서 한 칸씩 당김)
			array[rear] = 0; // 마지막에 0을 넣어줌.
			// 200, 300, 0
			rear--; // 맨 뒤가 하나 줄었음.
			size--; // 사이즈만 하나 줄임.(삭제X 덮어쓰기O)
		}
		return item; // -9999를 반환함.
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

		intArrayQueue queue = new intArrayQueue(3); // 큐의 용량: 3

		// 데이터 넣기
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300); // 여기까지 용량 허용됨.
		queue.enqueue(400); // 메모리 공간 차서 안 들어감.(if문 작동)

		// 데이터 꺼내고 삭제 처리
		//queue.dequeue(); // 맨 처음 들어온 녀석부터 꺼내지고 삭제 처리 된다.

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue()); // 더이상 메모리 공간에 요소가 없어서(비어있어서) -9999가 출력됨.
	}// end of main
} // end of class