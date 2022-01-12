package runnerFile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
	features = ".", glue = {"stepdefinations"} , tags = {"@Promo"},
	
	plugin = {"pretty","html:target/cucumber-html-report","json:target/cucumber.json","rerun:target/failedrerun.txt"}
	
	
	
	//String xpath_checkbox = ""((//a[@title='IIIBBMII'])/../..)/preceding-sibling::td//label";
)
@Test
public class RegressionRunner extends AbstractTestNGCucumberTests { 
	 
	 
	@BeforeClass
	public static void setup() {
		
        System.out.println("Before Invoke the browser ");
       // base.Test.login();
       
        
       
	}
	
	@AfterClass
	public static void teardown() {
		
	}
	
}
