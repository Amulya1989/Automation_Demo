package pageObject;

import org.openqa.selenium.By;

public class Account {

	
	public static final By account = By.xpath("//a[@title='Accounts']");
	public static final By newbtn = By.xpath("//a[@title='New']");
	public static final By acc_description = By.xpath("(//label/span[text()='Account Description']/..)/following-sibling::textarea");
	public static final By acc_Name = By.xpath("((//span[text()='Account Name'])[2]/..)/following-sibling::input");
	public static final By acc_Number = By.xpath("(//span[text()='Account Number']/..)/following-sibling::input");
	public static final By acc_rating = By.xpath("(//span[text()='Account Rating'])/../following-sibling::div/div/div/div/a");
	public static final By rating_select = By.xpath("//a[@title='Hot']");
	public static final By acc_save = By.xpath("(//span[text()='Save'])[2]");
	public static final By acc_details = By.xpath("//span[text()='Details']");
	
	
	
}
