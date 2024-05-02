package basic.ch22;

public class Turtle implements RaceParticipant{
	
	private final int speed = 2;// 상수(고정값) // 거북이 고유의 속도

	@Override
	public String getName() {
		return "깡총깡총거북이";
	}

	@Override
	public int getSpeed() {
		return speed;
	}
	

}
