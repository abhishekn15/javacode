package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class ExceptionHandling {
	@Test(expectedExceptions =NoSuchElementException.class)
	public void Login() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		 WebElement actual = driver.findElement(By.id("username"));
		 actual.sendKeys("admin");
		WebElement psd = driver.findElement(By.name("psd"));
		psd.sendKeys("manager");
	
	 
		
		driver.findElement(By.id("loginButton")).click();
	
		driver.close();
	}

}
