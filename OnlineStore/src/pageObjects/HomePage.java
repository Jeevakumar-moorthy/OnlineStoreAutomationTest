package pageObjects;

import org.openqa.selenium.*;


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
