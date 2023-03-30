package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\FormFilling.feature"},
		
		glue = {"steps"}
		
		
		
		)


public class DataTableRunner extends AbstractTestNGCucumberTests
{

}
