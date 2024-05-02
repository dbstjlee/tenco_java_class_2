package basic.ch12;

public class Bank {

	public static void main(String[] args) {

		Account a1 = new Account(1);
		Account a2 = new Account(2);

		
		a1.printWaitNumber();
		a1.printWaitNumber();
		a1.printWaitNumber();
		a1.printWaitNumber();
		
		a2.printWaitNumber();
		a2.printWaitNumber();
	}

}
