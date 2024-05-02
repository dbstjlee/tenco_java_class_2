package basic.exercise.toy;

import java.util.Random;

// 클래스 인형뽑기
// 상품들이 존재 가능
// 사자인형, 곰인형, 에어팟 -> Product라는 배열 공간을 선언, 기능: 인형 넣기 , 랜덤으로 인형 뽑기
// 요구 조건: 배열을 활용해서 객체들을 담아 주세요. 다형성 활용하기
public class ToyMachine {

	Random random = new Random(); // random 객체 생성
	int N1 = random.nextInt(5); // 인덱스 값 0~ 5까지의 random 값이 N1에 담김.

	public void miss() {
		System.out.println("인형을 놓쳤습니다.");
	}

	public void get() {
		System.out.println("인형을 뽑았습니다.");
	}

	public ToyMachine Random(ToyMachine[] C) { // ToyMachine[] 배열 데이터타입에 입력값 C를 넣었을 때
		return C[N1]; // ToyMachine이 리턴값이라 return 입력
		// 입력값 C 는 products를 치환한것. N1은 인덱스 0~5까지의 랜덤값
	}
}



//Product[] products; 배열 선언
	//public ToyMachine() {
		//products = new Product[30];
	

// 사장이 상품을 넣다
	//public void addProduct(Product product) {

	

	//public void addProduct(Product[] product) {


// 사용자가 돈을 넣고 게임을 한다.
	//public void pick() {

	

// 상품의 정보 출력
//void showInfo() {
	// for sys
	// 특정 상품의 변수... 메서드를 instanceof 활용...
