package basic.ch09;

public class Warrior2 {
	
	String Name;
	int Power;
	int HP;

	public Warrior2(String name, int power) {
		Name = name;
		Power = power;
		HP = 500;
	}

		// 전사 2가 전사 1을 공격함.
	public void attackWarroir(Warrior warrior) {
		System.out.println("전사2를 공격(" + this.Power + ")합니다.");
		warrior.BeAttacked(this.Power);
		}
	
	public void BeAttacked(int power) {
		if(HP<0) {
			System.out.println("이미 죽었습니다.");
			return;
		}
		HP = HP - power;
	}
	}
