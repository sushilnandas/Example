package demoo;

public class User {
	private int userID;
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public char getUser() {
		return user;
	}
	public void setUser(char user) {
		this.user = user;
	}
	private String userName;
	private String userEmail;
	private char user;
}
