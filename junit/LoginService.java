package junit;

public class LoginService {
	String userName;
	String password;
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
	
	public boolean login() {
		if(userName.equals("admin") && password.equals("admin123")) {
			return true;
		}
		else {
			return false;
		}
	}

}
