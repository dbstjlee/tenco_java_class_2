package basic.ch02;

public class DiscountClaculator {

	public static void main(String[] args) {

		//상수 선언 - 원가, 할인율
		double ORIGINAL_PRICE = 59.99;
		double DISCOUNT_RATE = 0.3; //30% 할인
		
		// 할인된 가격 = 원가 x (1-할인율)
		// 할인된 가격 계산하기 (비지니스 로직)
		
		double discountedPrice = ORIGINAL_PRICE * (1 - DISCOUNT_RATE);
		
		// 최종된 가격을 정수형으로 형변환 처리
		 int finalPrice = (int)discountedPrice;
		
		//결과 출력
		System.out.println("최종 가격 : " + finalPrice);
		System.out.println("최종 가격(소수점) : " + discountedPrice);
		
	}

}
