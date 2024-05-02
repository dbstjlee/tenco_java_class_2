package basic.ch22;

public class Rabbit implements RaceParticipant {

	private final int speed = 10; // 토끼 고유의 스피드

	@Override
	public String getName() {
		return "엉금엉금토끼";
	}

	@Override
	public int getSpeed() {
		return speed;
	}
}
