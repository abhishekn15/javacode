package UsingPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	
		@FindBy(id="username") WebElement username;
		@FindBy(name="pwd") WebElement password;
		@FindBy(id="loginButton") WebElement submit;
		
		public LoginPom(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
	public void enterusername(String us) {
		username.sendKeys(us);
	}
	public void enterpassword(String psd) {
		password.sendKeys(psd);
}
public void clickOnSubmit() {
		submit.click();
	}
	
	

}