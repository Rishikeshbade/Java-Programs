package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLogin {

	@Test//+ve Test Case
	void testUserLogin() {
		LoginService user = new LoginService();
		user.setUserName("admin");
		user.setPassword("admin123");
		assertTrue(user.login());
	}
	
	
	
	@Test//-ve Test Case
	void testwrongPassword() {
		LoginService pass = new LoginService();
		pass.setUserName("admin");
		pass.setPassword("WrongPassword");
		assertFalse(pass.login());
	}
	
	
	@Test// -ve Test Case
	void WrongUserName(){
		LoginService user = new LoginService();
		user.setUserName("WrongUserName");
		user.setPassword("admin123");
		assertFalse(user.login());
	}

}
