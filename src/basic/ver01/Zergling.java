package basic.ver01;

public class Zergling {

	private String name;
	private int power;
	private int hp;
	
	public Zergling(String name) {
		this.name = name;
		power = 3;
		hp = 50;
	}

	// get, set - 단축키: alt + shift + s > getter, setter 선택 > select all
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// 저글링이 질럿을 공격합니다.
	public void attackZealot(Zealot z) {
		System.out.println(this.name + " 이 " + z.gerName() + " 을 공격합니다.");
		z.beAttacked(this.power);
	}

	// 저글링이 마린을 공격합니다.
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
