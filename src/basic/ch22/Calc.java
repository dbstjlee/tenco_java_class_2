package basic.ch22;

public interface Calc {

	public abstract int add(int n1, int n2);
	public abstract int substract(int n1, int n2);
	public abstract int times(int n1, int n2);
	public abstract double divide(int n1, int n2); // 추상 메소드 -> 구현 메소드로 변경
	//만약 뭐가 뭐라면  0으로 나눌 수 없습니다 라고 sysout 출력하기
	
	
}
