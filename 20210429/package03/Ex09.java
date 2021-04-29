package package03;

public class Ex09 {

	String userId;
	String userEmail;
	String userName;
	
	Ex09(String userId, String userEmail, String userName){
		this.userId = userId;
		this.userEmail = userEmail;
		this.userName = userName;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public String getUserEmail() {
		return this.userEmail;
	}
	
	public String getUserName() {
		return this.userName;
	}
}
