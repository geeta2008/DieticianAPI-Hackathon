package runner;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

	//@RunWith(Cucumber.class) 
    @Test
	@CucumberOptions(features ="src/test/resources/features",
	glue= {"stepdefinitions","MorbidityAPI","RecipesAPI","AppHooks"},
	plugin={"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			"rerun:target/failedrerun.txt"
			},
		
	//},"html:target/HtmlReports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
   monochrome = true,
	dryRun = false,
	
			 publish = true
			 	 )
	public class MasterTestRunner extends io.cucumber.testng.AbstractTestNGCucumberTests 
	{

	}