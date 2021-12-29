package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static void login() {
		
		System.out.println("Hello trying to login ");
		String dir = System.getProperty("user.dir");
		System.out.println("Hello Welcome to New Automation ");
		System.setProperty("webdriver.chrome.driver", dir+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
	}

}
