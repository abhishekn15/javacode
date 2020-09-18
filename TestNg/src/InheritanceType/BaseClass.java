package InheritanceType;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

@BeforeClass
public void openBrowser() {
	Reporter.log("Browser is opened",true);
}
@BeforeMethod
public void login() {
	Reporter.log("login succesfull",true);
}
@AfterClass
public void logout() {
	Reporter.log("logout succesfull",true);
}
@AfterMethod
public void closeBrowser() {
	Reporter.log("Broswer is closed",true);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
