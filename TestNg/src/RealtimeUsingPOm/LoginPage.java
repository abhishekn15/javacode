package RealtimeUsingPOm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgnBTN;
	
public LoginPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	//here 'this' point the current object of class
}
public void login() {
  unTB.sendKeys("admin");
  pwTB.sendKeys("manager");
  lgnBTN.click();
}
public void login(String un,String pw) {
	unTB.sendKeys(un);
	pwTB.sendKeys(pw);
	lgnBTN.click();
}
public void setUsername(String un) {
	unTB.sendKeys(un);
}
public void setPassword(String pw) {
	pwTB.sendKeys(pw);
}
public void clickOnLgnBTN() {
	lgnBTN.click();
}
}


