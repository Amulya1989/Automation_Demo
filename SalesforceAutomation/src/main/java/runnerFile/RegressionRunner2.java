package runnerFile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(
	features = ".", glue = {"stepdefinations"} , tags = {"@Test"},
	
	plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","timeline:test-output-thread/"} 
	
	
	
	
)
@Test
public class RegressionRunner2 extends AbstractTestNGCucumberTests { 
	 
	 
	@BeforeClass
	public static void setup() {
		
        System.out.println("Before Invoke the browser ");
       // base.Test.login();
        
	}
	
	@AfterClass
	public static void teardown() {
		
	}
	
}


