package basic.exercise.toy;

import java.util.Scanner;

public class ToyMachineTest {

	// 코드 테스트
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ToyMachine product = new ToyMachine(); //ToyMachine 데이터 타입의 product 객체 생성 
//		TigerToy tigertoy1 = new TigerToy();
//		TigerToy tigertoy2 = new TigerToy();
//		BearToy beartoy1 = new BearToy();
//		BearToy beartoy2 = new BearToy();
//		Airpot airpot1 = new Airpot();
//		Airpot airpot2 = new Airpot();
		
		ToyMachine[] products = new ToyMachine[6]; // ToyMachine 배열 6칸 공간을 선언
		products[0] = new TigerToy();
		products[1] = new BearToy();
		products[2] = new Airpot();
		products[3] = new TigerToy();
		products[4] = new BearToy();
		products[5] = new Airpot();
		// 인덱스 0~5까지 배열 6칸에 값을 초기화함.
		
		product.Random(products); //ToyMachine 데이터 타입의 product 객체의 Random 메소드를 호출하고,
		// ToyMachine[] 배열의 products의 인덱스 값이 랜덤으로 출력되도록 Random을 호출하여 선언함.
		
		
		
		//product.miss(); //ToyMachine 데이터 타입의 product 객체의 in 메서드 호출
		//product.get();
		
		System.out.println("인형을 뽑으시려면 1번을 눌러주세요.");
		int A = sc.nextInt();
		
		for (int i = 0; i < products.length; i++) {
			if(products[i] instanceof TigerToy) {
				((TigerToy)products[i]).get();
				((TigerToy)products[i]).miss();
			} 
		}
			
		
		
		
		
			
	}// end of main

}// end of class
