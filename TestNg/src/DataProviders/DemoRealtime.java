package DataProviders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoRealtime {
	static {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	

	@Test(dataProvider="dataValues")
	public void test_LoginPage(String un,String psd) {
		Reporter.log("The user name is "+un,true);
		Reporter.log("The user name is "+psd,true);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(un);;
		driver.findElement(By.name("pwd")).sendKeys(psd);
		driver.findElement(By.id("loginButton")).click();
		WebElement errorMsg = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
		System.out.println(errorMsg.isDisplayed());
	}

	@DataProvider
	public String [][] dataValues(){
		String [][]s=new String [2][2];
		s[0][0]="Abhishek";
		s[0][1]="qsp123";
		s[1][0]="Singh";
		s[1][1]="asp123";
		
		return s;
		}
		

}
