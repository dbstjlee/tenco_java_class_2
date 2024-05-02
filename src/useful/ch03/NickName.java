package useful.ch03;

public class NickName {

	private String nick;
	
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) throws  NicknameException{
		if(nick == null) {
			System.out.println("null 값일 수 없음.");
			throw new NicknameException("null 값일 수 없음");
		}
		if(nick.length() < 6) {
			System.out.println("6자 이상이어야 함");
			throw new NicknameException("3자 이상이어야 함");
		}
		if(nick.matches("^[가-힣]")) {
			System.out.println("숫자나 특수문자 포함해야 함");
			throw new NicknameException("숫자나 특수문자 포함해야 함");
		}
		this.nick = nick;
	}
}
