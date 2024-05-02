package basic.ch09;

public class Warrior {

	String Name;
	int Power;
	int HP;

	public Warrior(String name, int power) {
		Name = name;
		Power = power;
		HP = 100;
	}

	// 전사 1이 전사 2를 공격함.
	public void attackWarroir2(Warrior warrior2) {
	System.out.println("전사2를 공격(" + this.Power + ")합니다.");
	warrior2.BeAttacked(this.Power);
	}
	

	// 전사 1이 데미지를 받음.

	public void BeAttacked(int power) {
		if(HP<0) {
			System.out.println("이미 죽었습니다.");
			return;
		}
		HP = HP - power;
	}
}
