package model;

//　ログインのセッションスコープ用JavaBeans
public class Login {
	private String userName; // ユーザーID
	private String password; // パスワード
	
	public Login(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
