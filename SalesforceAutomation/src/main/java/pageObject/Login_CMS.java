package pageObject;

import org.openqa.selenium.By;

import base.BaseClass;

public class Login_CMS extends BaseClass{
	
	public static final By UserName_CMS = By.xpath("//input[@id='login_userName']");
	public static final By Password_CMS = By.xpath("//input[@id='password']");
	public static final By login_CMS = By.xpath("//button[@id='login-btn']");
	

}
