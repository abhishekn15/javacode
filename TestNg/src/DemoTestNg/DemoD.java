package DemoTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoD {
	@Test(priority=0)
	public void login() {
		Reporter.log("Login to page",true);
	}
	@Test(dependsOnMethods="deleteuser")
	public void logout() {
		Reporter.log("logout from page",true);
	}
	
	@Test(dependsOnMethods="login",invocationCount=4)//it is used insted of for loop if require to create user=4times
	public void edituser() {
		//Assert.fail();use to fail the line
		Reporter.log("user has edited succesfully",true);
		
	}
	@Test(dependsOnMethods="edituser",invocationCount=4)
	public void deleteuser() {
		Reporter.log("user has been deleted",true);
	}
	
}
