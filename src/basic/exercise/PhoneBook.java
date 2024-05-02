package basic.exercise;

public class PhoneBook {

	// 속성
	private String userName;
	private String phoneNumber;

	public PhoneBook(String userName, String phoneNumber) {
		this.userName = userName;
		this.phoneNumber = phoneNumber;
	}

	// 기능

	public String getUserName() {
		return userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setUserName(String username) {
		this.userName = username;
	}
	public void setPhoneNumber(String phonenumber) {
		this.phoneNumber = phonenumber;
	}

}
