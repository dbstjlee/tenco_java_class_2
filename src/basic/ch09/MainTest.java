package basic.ch09;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		Warrior warrior = new Warrior("전사1", 50);
		Warrior warrior2 = new Warrior("전사2", 30);

		System.out.println("전사1이 전사2를 몇 번 공격하시겠습니까?");

		Scanner sc = new Scanner(System.in);
		int inputData = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			warrior.attackWarroir2(warrior2);
		}
		System.out.println("전사2의 HP 확인 : " + warrior2.HP);

	}

}
