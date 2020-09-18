package Testing;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class One {
	
	@Test
	public void Login() {
		Reporter.log("The login is",true);
	}
	
	@BeforeClass
	public void  openBrowswer() {
		Reporter.log("browswer is opened",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login in to application",true);
	}
	@Test
	public void createUser() {
		Reporter.log("Crating user",true);
	}
	@AfterMethod
        public void logout() {
		Reporter.log("Logout from the application",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("The browser is closed",true);
	}

}
