package basic.exercise.interfaces;

public class UserInfoMySqlDaoImpl implements IUserInfoDao{

	@Override
	public void insertUserInfo(UserInfo info) {
		// SQL : 질의어 - 배웠다면 --MySQL 언어를 활용해서 구현
		System.out.println("insert into user values(info.getUserName())");
	}

	@Override
	public void updateUserInfo(UserInfo info) {
		System.out.println("upadte set user_tb name = info.gerUserName()");
		
	}

	@Override
	public void deleteUserInfo(int id) {
		System.out.println("delete from user_tb where id = info.getId()");
	}

	@Override
	public void selectUserInfo() {
		System.out.println("select * from user_tb");
	}

	
	
}
