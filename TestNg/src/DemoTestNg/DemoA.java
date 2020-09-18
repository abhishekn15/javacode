package DemoTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	@Test
	public void A() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2500);
	String actualTitle =driver.getTitle();
	String exp="actiTIME - Enter Time-Track";
	if (actualTitle.equals(exp)) {
		System.out.println("test pass");
	}
	else {
		System.out.println("fail");
	}
	driver.close();
	}
	
	@Test
	public void Ab() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("adminj");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//Thread.sleep(2000);
		String actualTitle =driver.getTitle();
	String exp="actiTIME - Enter Time-Track";
	if (actualTitle.equals(exp)) {
		System.out.println("test pass");
	}
	else {
		System.out.println("fail");
	}
	driver.close();
	}
	@Test
	public void Abc() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("adminj");
		driver.findElement(By.name("pwd")).sendKeys("123456");
		driver.findElement(By.id("loginButton")).click();
		//Thread.sleep(2000);
		String actualTitle =driver.getTitle();
	String exp="actiTIME - Enter Time-Track";
	if (actualTitle.equals(exp)) {
		System.out.println("test pass");
	}
	else {
		System.out.println("fail");
	}
	driver.close();
	}
	@Test
	public void Abcd() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("adminj");
		driver.findElement(By.name("pwd")).sendKeys("manag11er");
		driver.findElement(By.id("loginButton")).click();
		//Thread.sleep(2000);
		String actualTitle =driver.getTitle();
	String exp="actiTIME - Enter Time-Track";
	if (actualTitle.equals(exp)) {
		System.out.println("test pass");
	}
	else {
		System.out.println("fail");
	}
	driver.close();
	}}
	


