package basic.ch12;

public class Account {

	private int id;
	public static int Account;

	public Account(int id) {
		this.id = id;
		Account = 111;
	}

	public void printWaitNumber() {
		
		System.out.println("계좌번호 : " + Account);
		Account++;
	}

}
