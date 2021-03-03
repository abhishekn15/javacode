package Demo99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.wait(5000, 500);
		driver.get("http://live.demoguru99.com/index.php/mobile.html");
		
		driver.findElement(By.xpath("(//*[@class=\"link-compare\"])[1]")).click();
		
		driver.findElement(By.xpath("(//*[@class=\"link-compare\"])[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[3]/div[2]/div[2]/div/button/span/span")).click();

	}

}
