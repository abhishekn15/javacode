package UsingPom;

import org.testng.annotations.Test;

public class InvalidLogin extends BaseClass {
	
	@Test
	 void openBrowswer() {
	
	LoginPom  lp=new LoginPom(driver);
	lp.enterusername("admlin");
	lp.enterpassword("manger");
	lp.clickOnSubmit();
	
    

}
}


