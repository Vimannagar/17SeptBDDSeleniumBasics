package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\Profile.feature"},
		
		glue = {"steps"},
		
		tags = "not @regression", 
		
		plugin = {"pretty"}
		
	
		
		
		)

public class ProfileRunnerWithTags extends AbstractTestNGCucumberTests {

}
