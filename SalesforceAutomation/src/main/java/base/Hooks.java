package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.runtime.Timeout;
import pageObject.Login;
import pageObject.Login_CMS;

public class Hooks extends BaseClass {

	
	
	public static void LoginSalesforce() {
		
		headless = false;
		BaseClass.initialize();
		driver.findElement(Login.UserName).sendKeys(prop.getProperty("UserName"));
		driver.findElement(Login.Password).sendKeys(prop.getProperty("Password"));
		driver.findElement(Login.login).click();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		boolean registerPage = driver.findElement(Login.Remind_me_later).isDisplayed();
		if(registerPage= true) {
			System.out.println("Resisgter Page Opened ");
			driver.findElement(Login.Remind_me_later).click();
			
		}else
		{
			System.out.println("Resisgter Page not Opened ");
		}
		driver.findElement(Login.AppMenu);
		System.out.println("------------------------ Salesforce Page display ------------------");
		
	}
	
	public static void LoginCMS() {
		
		
		headless = false;
		BaseClass.initialize_CMS_Portal();
		driver.findElement(Login_CMS.UserName_CMS).sendKeys(prop.getProperty("UserName_CMS"));
		driver.findElement(Login_CMS.Password_CMS).sendKeys(prop.getProperty("Password_CMS"));
		driver.findElement(Login_CMS.login_CMS).click();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
	}
	
}
