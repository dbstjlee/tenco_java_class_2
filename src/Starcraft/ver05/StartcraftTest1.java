package Starcraft.ver05;

public class StartcraftTest1 {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergling zergling = new Zergling("저글링1");
		
		zealot1.showInfo();
		marine1.showInfo();
		zergling.showInfo();
		System.out.println("-----------------------");
		zealot1.attack(marine1); // 메서드 오버로딩 -  메서드 명은 동일, 매개변수는 다름
		zergling.attack(marine1);
		zergling.attack(zealot1);
		marine1.showInfo();
		
		
	}// end of main

}// end of class
