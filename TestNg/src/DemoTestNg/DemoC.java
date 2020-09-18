package DemoTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoC {

	@Test(priority=0)
	public void login() {
		Reporter.log("Login to page",true);
	}
	@Test(priority=3)
	public void logout() {
		Reporter.log("logout from page",true);
	}
	
	@Test(priority=1,invocationCount=4)//it is used insted of for loop if require to create user=4times
	public void edituser() {//it is intilasze with 0 so if used 0,it will not run that annation
		Reporter.log("user has edited succesfully",true);
		
	}
	@Test(priority=2,invocationCount=4)
	public void deleteuser() {
		Reporter.log("user has been deleted",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
