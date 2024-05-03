package structure;

public class MyArrayStack {

	int top; // 스택의 최상위 요소를 가리킴
	TencoIntArray arrayStack; // int 타입을 가짐

	public MyArrayStack() {
		top = 0; // 스택 포인터 초기화
		arrayStack = new TencoIntArray(); // 배열칸 10개 생성됨
	}

	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new TencoIntArray(size);
	}

	// 스택의 크기(요소 개수)를 반환
	public int getSize() {
		return top;
	}

	// 스택이 비어있는지 확인
	public boolean isEmpty() {
		return top == 0; // true 를 반환(비어있음) 아니면 false 반환

	}

	// 스택의 요소가 가득 찼는지 확인하는 메서드를 만들어보자.
	public boolean isFull() {
		// 10 == 10 // 가득 찬거임
		// 9 == 10 (고정) // 가득 안 찬거임
		return top == arrayStack.ARRAY_SIZE;
	}

	// 스택의 모든 요소를 출력하는 기능
	public void printAll() {
		arrayStack.printAll(); // 정수값을 가질 수 있는 배열을 전부 출력함.
	}

	// 스택에 데이터를 추가하는 기능 // 무조건 맨 뒤로 더하는 기능
	public void push(int data) {
		// 방어적 코드(메모리 공간이 없으면 overflow 발생)
		if (isFull()) {
			System.out.println("메모리가 가득 가득");
			return; // 실행의 제어가 내려가면 안 됨.
		}
		arrayStack.addElement(data); // 밑에서 하나가 쌓인거임 // addElement : 제일 뒤에 값을 추가하는 기능
		top++; // 맨 밑에가 top point = 0 이었으면 하나가 쌓여서 top point = 1이니까 top에 ++ 붙여야 함
	}

	// 스택에서 데이터를 제거하고 반환하는 메서드 // 맨 위에 있는 것부터 꺼내서 제거함
	public int pop() { // 꺼내기만 하면 되서 매개변수를 담을 필요 없음
		if (top == 0) {// 꺼낼 게 없음
			System.out.println("stack is empty");
		}
		int temp = peek(); // temp 라는 상자에 잠깐 꺼내둠.
		System.out.println("Log 1 : " + (top - 1)); // top - 1 = 2
		arrayStack.removeElement(top - 1); // top = 개수 개념, removeElement = 인덱스 개념
		top--; // top 의 값을 다시 줄여야 함.
		return temp;
	}

	// 스택의 최상위 요소를 반환하지만 제거는 하지 않음 // 꺼내기만 함.
	public int peek() {
		if(top == 0) { //요소가 비어있어서 꺼낼 게 없음
			return TencoIntArray.ERROR_NUM;  // TencoIntArray의 ERROR_NUM를 반환함.
		}
		// 그게 아니라면
		return arrayStack.getElement(top - 1); // getElement가 인덱스 번호라서 top에 - 1함(- 1 안하면 오류 뜰 수 있음)
		// TencoIntArray의 getElement() 메서드를 반환함
	}
	
	// 코드 테스트
	public static void main(String[] args) {
		MyArrayStack stack = new MyArrayStack(); // 객체 생성
		stack.push(100);
		stack.push(200);
		stack.push(300);
		
		// 안에 들어 가있는 거 전체 출력
		//stack.printAll();
		//stack.pop(); // 버그 해결 
		System.out.println(stack.pop());
		//--> pop에 제거된 요소를 반환할 수 있도록 코드를 수정하기
		//log 찍는거 = logging
		System.out.println("---------------------------");
		//stack.printAll();
		System.out.println(stack.peek()); // 마지막에 있던 200만 출력됨.
		System.out.println("---------------------------");
		stack.printAll(); // 요소는 제거가 안 됨.
		
		
		
		
		
	}// end of main
	
	
}
