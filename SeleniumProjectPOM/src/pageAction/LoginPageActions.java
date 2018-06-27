package pageAction;

import org.openqa.selenium.WebDriver;

import pageObject.LoginPage;

public class LoginPageActions extends LoginPage{
	
	public LoginPageActions(WebDriver driver) {
		
		super(driver);
	}
	
	public void enterUserName(String userName) {
		
		txtUsername.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		
		txtPassword.sendKeys(password);
	}
	
	public void clickLogibButton() {
		
		btnLogin.click();
	}
	
	public String getInvalidLoginMessage() {
		
		return invalidLoginMessage.getText();
	}

}
