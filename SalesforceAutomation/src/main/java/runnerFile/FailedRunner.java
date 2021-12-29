package runnerFile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
	
	
	plugin = {"rerun:target\\failedrerun.txt"},glue = {"stepdefinations"},
	features = {"@target\\failedrerun.txt"}
	
	
)
@Test
public class FailedRunner extends AbstractTestNGCucumberTests { 
	 
	 
	@BeforeClass
	public static void setup() {
		
        System.out.println("Before Invoke the browser ");
       // base.Test.login();
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
	}
	
	@AfterClass
	public static void teardown() {
		
	}
	
}
