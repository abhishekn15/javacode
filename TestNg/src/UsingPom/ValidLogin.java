package UsingPom;

import org.testng.annotations.Test;

public class ValidLogin extends BaseClass {
	@Test
	 void openBrowswer() {
	
	LoginPom  lp=new LoginPom(driver);
	lp.enterusername("admin");
	lp.enterpassword("manger");
	lp.clickOnSubmit();
	
     

}
}