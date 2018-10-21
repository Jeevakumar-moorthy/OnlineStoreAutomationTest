package pageObjects;

import org.openqa.selenium.*;

// This is edited By Barani @21102017:2017
public class HomePage {

	
	public static WebElement lnk_MyAccount(WebDriver driver)
	{
		return driver.findElement(By.id("account"));
	}
	
	public static WebElement lnk_Account(WebDriver driver)
	{
		return driver.findElement(By.id("account_logout"));
	}
	
}
