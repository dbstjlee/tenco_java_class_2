package basic.exercise.toy;

public class Airpot extends ToyMachine{

	@Override
	public void miss() {
		System.out.println("에어팟을 놓쳤습니다. ");
	}
	@Override
	public void get() {
		System.out.println("에어팟을 뽑았습니다.");
	}
}
