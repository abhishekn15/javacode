package ParallelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class DemoA {
	
	static {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		
		//"webdriver.gecko.driver","./Driver/geckodriver.exe"
	       }
	public WebDriver driver;
	@Test
	public void launchChrome() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//driver.close();
	}
	@Test
	public void launchFirefox() {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("https://demo.actitime.com/login.do");
	}
	
	
}
