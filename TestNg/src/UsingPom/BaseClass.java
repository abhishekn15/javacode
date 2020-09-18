package UsingPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	public WebDriver driver;
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	@BeforeMethod
	public void openBrowser() {
		 driver = new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	
	}	
	
	@AfterMethod
	public void closeBrowswer() {
		driver.close();
       }
	

}
