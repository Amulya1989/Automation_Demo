package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static WebDriver driver ;
	public static int driverActive ;
	public static String os="";
	public static boolean headless=false;
	public static boolean incognito=false;
	public static Properties prop;
	
	public BaseClass() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	// Method - initialize the browser 
	// Date - 05/june/2021 
	// Design By - Amulya Kumar 
	
	public static void initialize() {
		String browserName = "chrome";
		os = System.getProperty("os.name");
		System.out.println("Operating System is - "+os);
		SelectDriver(browserName,os);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
		
				
		
		
	}
	
	protected static void SelectDriver(String browserName, String os) {
		if(headless) {
			
			System.out.println("Headless True ");
			
		}else {
			if(browserName.equals("chrome")) {
				if(os.contains("Mac OS X")) {
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"driver/chromedriver");
					
				}else if(os.contains("Windows")) {
					String dir = System.getProperty("user.dir");
					System.setProperty("webdriver.chrome.driver", dir+"\\driver\\chromedriver.exe");
					//-------------------Handle to Location alert in Salesforce Page --------------
					//Create a map to store  preferences 
					Map<String, Object> prefs = new HashMap<String, Object>();
					//add key and value to map as follow to switch off browser notification
					//Pass the argument 1 to allow and 2 to block
					prefs.put("profile.default_content_setting_values.notifications", 2);
					//Create an instance of ChromeOptions 
					ChromeOptions options = new ChromeOptions();
					// set ExperimentalOption - prefs 
					options.setExperimentalOption("prefs", prefs);
					//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
					 driver=new ChromeDriver(options);
					 //---------------------------------------------------------------------------
					//driver.get("https://login.salesforce.com/");
				}else if(os.contains("Linux")){
					
				}
			}else if(browserName.equals("msedge")) {
				if(os.contains("Mac OS X")) {
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/msedgedriver");
					
				}else if(os.contains("Windows")) {
					System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/msedgedriver.exe");	
				}else if(os.contains("Linux")){
					
				}
			}
			
		}
		
		
	}
	
	public static void SetupEdgeBroswer() {
		
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driverActive =2; 
		
	}
	
	public static void SetupChromebrowser() {
		
		ChromeOptions options1 =new ChromeOptions();
		options1.addArguments("--disable-notifications");
		options1.addArguments("--disable-gpu");
		options1.addArguments("--window-size=1290,1080");
		options1.addArguments("--start-maximized");
		options1.addArguments("--disable-dev-shm-usage");
		if(incognito)
			options1.addArguments("--incognito");
		endDriverSession();
		
		driver = new ChromeDriver(options1);
		driver.manage().window().maximize();
		driverActive =2; 
		
		
	}
	
	public static void endDriverSession() {
		try {
			if(BaseClass.driver!=null)
				BaseClass.driver.close();
			if(BaseClass.driver!=null)
				BaseClass.driver.quit();
			if(BaseClass.driver!=null)
				CloseAllTab();
			
		}catch(Exception e) {
			
		}
	}
	
	public static void CloseAllTab() {
		String originalHandle = driver.getWindowHandle();
		for(String handle : driver.getWindowHandles()) {
			if(!handle.equals(originalHandle)) {
				driver.switchTo().window(handle);
				driver.close();
			}
			
		}
		driver.switchTo().window(originalHandle);
		
	}
	
	
	
	
	
}
