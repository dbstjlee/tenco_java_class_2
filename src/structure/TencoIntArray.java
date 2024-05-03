package structure;
/**
 * 배열을 활용 클래스를 설계 물론 --> 이미 자바 표준 API 개발자들이 잘 만들어 준 클래스 들이 존재한다. 
 * 하지만 직접 기능을 확장해서 만들어 보자.
 */
public class TencoIntArray {

	int[] intArr; //intArr 배열 공간 선언
	int count; // 배열 안에 들어간 요소의 개수
	public final int ARRAY_SIZE; // 배열 크기
	public static final int ERROR_NUM = -99999999; 

	public TencoIntArray() { //기본 생성자
		count = 0; // 요소 = 0개
		ARRAY_SIZE = 10; // 배열 크기 = 10
		intArr = new int[ARRAY_SIZE];  //배열 크기가 10개 초기화 
	}

	public TencoIntArray(int size) { //생성자 오버로딩
		count = 0;
		ARRAY_SIZE = size; // 입력한 값이 배열크기가 됨.
		intArr = new int[ARRAY_SIZE];
	}

	// 기능 설계
	// 배열 요소의 제일 뒤에 값을 추가하는 기능을 가진다.
	public void addElement(int inputData) {
		// 방어적 코드 필요
		if (count >= ARRAY_SIZE) { // 요소가 배열 크기보다 크거나 같으면 공간이 참.
			System.out.println("메모리 공간이 가득 찼습니다.");
			return; // 실행의 제어권을 반납 // if 문 수행 시 밑에 코드로 안 넘어감.
		}
		intArr[count++] = inputData; // 메서드로 감싸서 편리하게 쓸 수 있음.
		// count++;
	}

	

	// 지정한 인덱스 번호에 요소를 꺼내주기
	public int getElement(int position) {
		// 방어적 코드
		// 배열의 크기 10
		// [0] [1] [2] --> 3 3 - 1 = 2
		if (position < 0 || position > count - 1) { // 할당받은 수가 마이너스이거나 인덱스 수보다 클 때
			System.out.println("검색 위치 요류. 현재 리스트의 개수는 " + count + " 개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}

	// 요소를 전체 출력하는 기능 만들어 주기
	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

		// for (int i : intArr) { // 요소가 있으면 i에 담고 수행함
		// 인덱스 번호가 존재하지 않음(제어할 수 없음)//무조건 처음부터 끝까지 동작함.
		// System.out.println(intArr[i]);
	}

	// 전체 삭제 하는 기능
	public void removeAll() {
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = 0;
		}
		// 요소의 개수 상태를 항상 관리하고 처리해야 한다.
		count = 0;

	}
	// 배열의 크기가 아님. 현재 요소의 개수를 반환
	public int getCountSize() {
		return count;
	}
	
	
	// 현재 요소가 하나도 없는 상태이다.
	public boolean isEmpty() {
		if(count == 0) {
			return true;
		} else {
			return false; // 비어있지 않다면 false
		}
	}
	
	// 배열의 지정한 인덱스 위치에 값을 삽입하기
		public void insertElement(int position, int inputData) {
			// 방어적 코드 1
			if (count >= ARRAY_SIZE) {
				System.out.println("메모리 공간이 가득 찼습니다.");
				return;
			}

			// 방어적 코드 2
			// 10 < 0 -> false => 출력 안 됨.
			if (position < 0 || ARRAY_SIZE < position) {
				System.out.println("지정한 인덱스 번호가 잘못 되었습니다.");
				return;
			}
			// 요청값 : position -> 3
			// 0 1 2 3 4
			// [11,12,13,14,15]
			// [11,12,13,[],14,15] : 한칸 씩 밀기
			for (int i = count - 1; i >= position; i--) { // count = 개수, count -1 = 인덱스
				intArr[i + 1] = intArr[i]; // 하나씩 밀어야 함
				// intArr[5] = 15; 수행 1
				// intArr[4] = 14; 수행 2

			}

			intArr[position] = inputData;
			count++; // 요소값이 들어갔기 때문에 계속 수정되어야 함.

		}
	
		// 지정한 인덱스 번호의 요소를 삭제하기
		public void removeElement(int position) {
			
			
			// 방어적 코드
			if(isEmpty()) {
				System.out.println("삭제할 요소가 없습니다.");
			}
			
			// position = 2를 할당 받음(넘겨 받은 값)
			System.out.println("Log 2 : " + count);
			// 인덱스 범위를 잘못 지정했다면 방어적 코드
			if(position < 0 || position >= count) {
				System.out.println("잘못된 요청입니다.");
			}
			
			//intArr[position]; -> intArr의 position 을 찾아갈 수는 있음. 
			// 사용자가 요청한 인덱스 번호는 0번이라고 가정
			// [100] [200] [300] [400]
			// [200] [300] [400] [] // 당겨짐
			
			//   0     1     2
			// [100] [200] [300]
			//               2           3    --> 횟수로는 한 번 반복한다.  
			for (int i = position; i < count; i++) { // 사용자가 요청한 번호 = position 기준
				System.out.println("Log 3 : " + i);
				
				//   0  
				//   0 + 1
				//   2    = intArr[3]
				intArr[i] = intArr[i + 1];
				// [100] [200] [0] [0]
			}
			count--;
			
		}
	
	
	
	
	
}
