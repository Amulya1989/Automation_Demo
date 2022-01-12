package pageObject;

import org.openqa.selenium.By;

import base.BaseClass;

public class Login extends BaseClass {

	public static final By UserName = By.xpath("//input[@id='username']");
	public static final By Password = By.xpath("//input[@id='password']");
	public static final By login = By.xpath("//input[@id='Login']");
	public static final By AppMenu = By.xpath("//div[@class='slds-icon-waffle']");
	public static final By Remind_me_later = By.xpath("//a[text()='Remind Me Later']");

	
}
