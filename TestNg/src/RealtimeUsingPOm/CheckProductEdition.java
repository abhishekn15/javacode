package RealtimeUsingPOm;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckProductEdition extends BaseTest{
	
	

	@Test
	public void checkProductEdition () throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.login();
	    Thread.sleep(2000);
	
		driver.findElement(By.xpath("(//div[contains(text(),'Settings')])[1]")).click();
		driver.findElement(By.linkText("Licenses")).click();
		Thread.sleep(2000);
		
		String expectedPE = "actiTIME 2017.4";
		String actualPE = driver.findElement(By.xpath("//nobr[text()='Product Edition:']/../../td[2]")).getText();
		System.out.println("actual ProductEditon--->" + actualPE);
		if (actualPE.equals(expectedPE)) {
			Reporter.log("The Test case is Passed", true);
		} else {
			Reporter.log("The Test case is Failed", true);
		}
	}

	

}

