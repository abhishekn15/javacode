package Grouping;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoA {

	@Test(priority=0,groups="regression")
	public void  openBrowswer() {
		Reporter.log("browswer is opened",true);
	}
	@Test(priority=1,groups="regression")
	public void login() {
		Reporter.log("login in to application",true);
	}
	@Test(priority=1,groups="smoke")
	public void createUser() {
		Reporter.log("Crating user",true);
	}
	@Test(priority=1,groups="regression")
        public void logout() {
		Reporter.log("Logout from the application",true);
	}
	@Test(priority=1,groups="smoke")
	public void closeBrowser() {
		Reporter.log("The browser is closed",true);
	}
}
	
	
	
	
	
	
	
	

