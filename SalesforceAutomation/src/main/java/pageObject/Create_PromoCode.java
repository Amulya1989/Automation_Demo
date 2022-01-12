package pageObject;

import org.openqa.selenium.By;

public class Create_PromoCode {
	
	public static final By promotion_btn = By.xpath("//button[@id='promotions_menu']");
	public static final By promo_type = By.xpath("//select[@id='promo-type']");
	public static final By promo_type_regular = By.xpath("//option[contains(text(),' Regular ')]");
	public static final By promo_code = By.xpath("//input[@id='promo-code']");
	public static final By campaign_name = By.xpath("//input[@id='camp_name']");
	public static final By campaign_start_date = By.xpath("(//span[text()='ui-button'])[1]");
	public static final By campaign_end_date = By.xpath("(//span[text()='ui-button'])[2]");
	public static final By ticket_Exp_date = By.xpath("(//select[@id='promo-exp-type'])[1]");
	public static final By exp_date_timebased = By.xpath("(//option[text()='Time Based'])[1]");
	public static final By no_of_days = By.xpath("(//input[@id='promo-no-days'])[1]");
	public static final By max_allowed_count = By.xpath("//input[@id='promo-maxcount']");
	public static final By discount_type = By.xpath("//input[@id='discountType-Dollar']");
	public static final By discount_in_dollar = By.xpath("//input[@id='promo-discount-dollar']");
	public static final By user_type = By.xpath("//select[@id='promo-userType']");
	public static final By user_type_new = By.xpath("(//option[text()='New'])[1]");
	public static final By products = By.xpath("(//label[text()='Rail'])[1]");
	public static final By rail_origin = By.xpath("(//label[text()='Choose'])[1]");
	public static final By rail_destination = By.xpath("(//label[text()='Choose'])[2]");
	public static final By rail_via = By.xpath("(//label[text()='Choose'])[3]");
	public static final By rail_exclusion = By.xpath("(//label[text()='Choose'])[4]");
	
	

}
