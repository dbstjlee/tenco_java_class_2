package basic.exercise.toy;

public class TigerToy extends ToyMachine{

	@Override
	public void miss() {
		System.out.println("호랑이 인형을 놓쳤습니다. ");
	}
	@Override
	public void get() {
		System.out.println("호랑이 인형을 뽑았습니다.");
	}
}
