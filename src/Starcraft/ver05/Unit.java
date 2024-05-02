package Starcraft.ver05;

/**
 * public protected -- 상속관계 설정할 수 있다. default private
 */
public class Unit {

	protected String name;
	protected int power;
	protected int hp;

	public Unit(String name) {
		this.name = name;
	}

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

	public void attack(Object z) {
		if(z  instanceof Unit) {
			System.out.println(this.name + " 이 " + ((Unit)z).getName() + " 을 공격합니다.");
			((Unit)z).beAttacked(this.power);
			// 질럿, 마린, 저글링은 unit으로 볼 수 있음. 매개변수를 Unit 으로 바꿔도 다형성으로 쓸 수 있음.
			
		}
	}

	public void showInfo() {
		System.out.println("========상태창=======");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}

}
