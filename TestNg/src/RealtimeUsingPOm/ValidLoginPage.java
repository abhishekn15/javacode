package RealtimeUsingPOm;

import org.testng.annotations.Test;

public class ValidLoginPage extends BaseTest  {
	@Test
	public void validLoginpageTest() {
		LoginPage lp=new LoginPage(driver);
		lp.login();
	}

}
