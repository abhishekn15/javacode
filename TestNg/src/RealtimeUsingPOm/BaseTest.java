package RealtimeUsingPOm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void openApplication() {
		driver.get("https://demo.actitime.com/login.do");
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
}
}
