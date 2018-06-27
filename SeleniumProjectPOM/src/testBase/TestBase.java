package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public void initialize(String broswer, String url) {
		
		openBrowser(broswer);
		getUrl(url);
		
	}
	
	public void openBrowser(String broswer) {
		
		if(broswer.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Testing Installables\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(broswer.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Testing Installables\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}
	
	public void getUrl(String url) {
		
		driver.get(url);
	}
	
	public void closeBrowser() {
		
		driver.close();
	}

}
