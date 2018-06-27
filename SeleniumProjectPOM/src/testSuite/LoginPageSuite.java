package testSuite;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import genericAction.ExcelFile;
import pageAction.LoginPageActions;
import testBase.TestBase;

public class LoginPageSuite extends TestBase{
	
	
	ExcelFile ef = new ExcelFile();
	
	@BeforeMethod
	public void beforeTest() {
		
		initialize("chrome", "http://opensource.demo.orangehrmlive.com/");
				
	}
	
	@Test
	public void verifyWithValidLoginCredentials() {
		
		LoginPageActions lpa = new LoginPageActions(driver);
		String userName = ef.readExcelData(0,1,0);
		System.out.println("username :"  +userName);
		String password = ef.readExcelData(0, 1, 1);
		System.out.println("Password :"  +password);
		lpa.enterUserName(userName);
		lpa.enterPassword(password);
		lpa.clickLogibButton();
		
		String expResult = "OrangeHRM";
		String actulResult = driver.getTitle();
		
		Assert.assertEquals(actulResult, expResult);
	}
	
	@Test
	public void verifyWithoutValidLoginCredentials() {
		
		LoginPageActions lpa = new LoginPageActions(driver);
		String userName = ef.readExcelData(0,2,0);
		System.out.println("username :"  +userName);
		String password = ef.readExcelData(0, 2, 1);
		System.out.println("Password :"  +password);
		lpa.enterUserName(userName);
		lpa.enterPassword(password);
		lpa.clickLogibButton();
		
		String expResult = "Invalid credentials";
		String actualResult = lpa.getInvalidLoginMessage();
		System.out.println("Invalid Message :" +actualResult);
		
		Assert.assertEquals(expResult, actualResult);
	}

	@AfterMethod
	public void afterTest() {
		
		closeBrowser();
	}
}
