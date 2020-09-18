package ParallelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Actime {
	static {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
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
		//driver.manage().window().maximize();
		driver.get("http://live.demoguru99.com/index.php/customer/account/create/");
		
		
		for(int i=0;i<4;i++) {
			WebElement fn = driver.findElement(By.id("firstname"));
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
			fn.sendKeys("abhishek");
			fn.clear();
		
			for (int j=0;j<4;j++) {
				WebElement md = driver.findElement(By.id("middlename"));
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
				md.sendKeys("abhushe");
				System.out.println(md.getText());
				md.clear();
			
				/*for (int k=0;k<10;k++) {
					WebElement ld = driver.findElement(By.id("lastname"));
					driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
					ld.sendKeys("abhushe");
					System.out.println(ld.getText());
                     ld.clear();*/
			}}
	
		driver.close();
		}

}
