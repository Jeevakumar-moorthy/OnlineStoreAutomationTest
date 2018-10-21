package automationFramework;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.HomePage;
import pageObjects.LoginPage;



public class POM_TC {
	

	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jeevakumar\\eclipse-workspace\\Selenium_Dependencies\\chromedriver.exe");
		
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		
		HomePage.lnk_MyAccount(driver).click();
		LoginPage.txtbx_UserName(driver).sendKeys("testuser_1");
		LoginPage.txtbx_Password(driver).sendKeys("Test@123");
		LoginPage.btn_LogIn(driver).click();
			
		System.out.println("Login Successful, Time to Log off");
		HomePage.lnk_Account(driver).click();
		driver.quit();
		
	}
	

}
