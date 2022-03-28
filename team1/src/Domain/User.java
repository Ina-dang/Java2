package Domain;

public class User { //AdminService
/*
 * 직원인지 관리자인지 
 */
	
	private boolean admin;
	private String password = "1111";
	
	private static User user = new User();
	private User() {}
	public static User getInstance() {
		return user;
	}
	
	public User(String password) {
		super();
		this.password = password;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return String.format("%s", password);
	}
	
	
	
}
