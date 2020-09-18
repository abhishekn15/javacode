package RealtimeUsingPOm;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckIssueDate extends BaseTest{


	@Test
	public void checkIssueDate() throws InterruptedException {
	
		LoginPage lp=new LoginPage(driver);
		lp.login();
	Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[contains(text(),'Settings')])[1]")).click();
		driver.findElement(By.linkText("Licenses")).click();
		
		Thread.sleep(2000);
		String expectedIssueDate = "Jul 14, 2017";
		String actualIssuedate = driver.findElement(By.xpath("//nobr[text()='Issue Date:']/../../td[2]")).getText();
		System.out.println("actual issue date--->" + actualIssuedate);
		if (actualIssuedate.equals(expectedIssueDate)) {
			Reporter.log("The Test case is Passed", true);
		} else {
			Reporter.log("The Test case is Failed", true);
		}
	}

	}

