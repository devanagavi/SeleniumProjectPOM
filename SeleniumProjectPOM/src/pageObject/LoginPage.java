package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="txtUsername")
	public WebElement txtUsername;
	
	@FindBy(id="txtPassword")
	public WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	public WebElement btnLogin;
	
	@FindBy(id="spanMessage")
	public WebElement invalidLoginMessage;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}
