package ParallelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoC {
	static {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		//"webdriver.gecko.driver","./Driver/geckodriver.exe"
	       }
	public WebDriver driver;
	@Test
	@Parameters( "sBrowser")
	public void launchChrome(String sBrowser) {
		if(sBrowser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if (sBrowser.equals("gecko")) {
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		
		for(int i=0;i<100;i++) {
			WebElement unTb = driver.findElement(By.id("username"));
			unTb.sendKeys("abhishek");
			unTb.clear();
		

		}
		driver.close();
		}
	
}