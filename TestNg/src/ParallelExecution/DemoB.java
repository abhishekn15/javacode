package ParallelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoB {
	
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
		driver.close();
	}
	
}
