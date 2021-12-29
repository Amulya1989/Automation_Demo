package stepdefinations;


import base.Hooks;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.Account;

public class AccountManagment extends BaseClass{
	public String s = null;
	@Given("^User login to salsforce application$")
	public void user_login_to_salsforce_application() throws Throwable {
	    
		Hooks.LoginSalesforce();
		
	}

	@When("^user can create an account with \"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\" , \"([^\"]*)\"$")
	public void user_can_create_an_account_with(String Account_Description, String Account_Name, String Account_Number, String Account_Rating) throws Throwable {
	    
	    System.out.println(driver+"  == Driver return ");
	   WebElement acc_btn =  driver.findElement(Account.account);
	    System.out.println("==== Pass==== ");
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", acc_btn);
	    //driver.findElement(Account.account).click();
	    driver.findElement(Account.newbtn).click();
	    String alphabet = Account_Name;
	    s = RandomStringUtils.random(8, alphabet);
	    driver.findElement(Account.acc_description).sendKeys(Account_Description+ "    "+s);
	    
	    driver.findElement(Account.acc_Name).sendKeys(s);
	    driver.findElement(Account.acc_Number).sendKeys(Account_Number);
	    driver.findElement(Account.acc_rating).click();
	    driver.findElement(Account.rating_select).click();
	    driver.findElement(Account.acc_save).click();	    
	}
	
	@Then("^User will validate created Account \"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\" , \"([^\"]*)\"$")
	public void user_will_validate_created_Account(String Account_Description, String Account_Name, String Account_Number, String argAccount_Rating) throws Throwable {
	    System.out.println(s+"   Verify Account ");
	    driver.findElement(Account.acc_details).click(); 
	 String AccountName =  driver.findElement(By.xpath("(//div/span[text()='Account Name'])/../following-sibling::div/span/span")).getText();
	
	 if(s.equals(AccountName)) {
		 System.out.println(" Account created successfully "+AccountName);
		 
	 }else {
		 System.out.println(" Account not created  successfully "+AccountName);
		 Assert.assertEquals(true, AccountName);
	 }
	 
	 WebElement acc_btn =  driver.findElement(Account.account);	  
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();", acc_btn);
	driver.findElement(By.xpath("//a[@title='"+s+"']"));   
	System.out.println("Pass -------------------->>>>>>>>>"); 
	}
	
}
