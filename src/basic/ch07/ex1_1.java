package basic.ch07;

public class ex1_1 {

	String username;
	String Ordername;
	String address;
	int Orderprice;
	
	public void name() {
		System.out.println(username + "님");
	}
	public void food() {
		System.out.println(Ordername + "을(를) 주문하셨습니다.");
	}
	public void ads() {
		System.out.println(address + "로 배송될 예정입니다.");
	}
	public void price() { 
		System.out.println(Orderprice + "원이 결제되었습니다.");
	}
}
