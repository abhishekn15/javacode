package Parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class DemoLogin {
	
	static {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	@Test
	@Parameters({"url","un","psd"})
	public void test_loginPage(String url,String un,String psd) {
		Reporter.log("The user name is"+un,true);
		Reporter.log("The password is"+psd,true);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(psd);
		driver.findElement(By.id("loginButton")).click();
		
		
	}

}
