package Starcraft.ver03;

public class Marine extends Unit {

	// ctrl + space + enter - 단축키
	public Marine(String name) {
		super(name); // 부모가 먼저 태어나야 해서 순서(위치) 바뀌면 문법이 틀림.
		super.name = name;
		super.power = 4;
		super.hp = 70;

	}

}
