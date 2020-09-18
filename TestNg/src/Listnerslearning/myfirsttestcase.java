package Listnerslearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listnerslearning.ListnerDemoExample.class)
public class myfirsttestcase {
	@Test
	public void TestLogin() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String tile = driver.getTitle();
		System.out.println(tile);
		driver.close();
	}

	@Test
	public void failTheTest() {
		System.out.println("To fail the programe we use Asserttrue");
		Assert.assertTrue(true);
	}
	
}
