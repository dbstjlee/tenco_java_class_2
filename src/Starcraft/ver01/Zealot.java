package Starcraft.ver01;

public class Zealot {

	private String name;
	private int power;
	private int hp;

	public Zealot(String name) {
		this.name = name;
		power = 5;
		hp = 80;
	}

	// getter
	public String gerName() {
		return name;

	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	// 질럿이 저글링을 공격합니다.
	// 매개변수 - 객체 간의 상호작용 할 수 있음.
	public void attackZergling(Zergling z) {
		System.out.println(this.name + " 이 " + z.getName() + " 을 공격합니다.");
		z.beAttacked(this.power);
	}
	// getter는 read 성질을 가짐. private 이라서 저글링의 이름을 여기서 변경하지 못함. 
	// getName 은 호출해서 이름을 불러들이기만 함.

	// 질럿이 마린을 공격합니다.
	public void attackMarine(Marine m) {
		System.out.println(this.name + " 이 " + m.getName() + " 을 공격합니다.");
		m.beAttacked(this.power);
	}

	// 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		// 방어적 코드
		// 80 --- 75 == 5 남음
		// 5 -- 75 == -70
		if (hp <= 0) {
			System.out.println("[" + this.name + "] 이미 사망하였습니다.");
			hp = 0; // hp가 - 가 나오기때문에 0으로 고정시킴.
			return;
		}
		hp -= power;
	}
	public void showInfo() {
		System.out.println("========상태창=======");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}
	
	
}
