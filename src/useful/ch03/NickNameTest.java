package useful.ch03;

public class NickNameTest {

	public static void main(String[] args) {
		
		NickName nick = new NickName();
		String inputnick = null;
		inputnick = "ㄴㅇㄹㄴㅇㄴㅇ1234";
		
		try {
			nick.setNick(inputnick);
		} catch(NicknameException e) {
			System.out.println("닉넴 변경 부탁");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
