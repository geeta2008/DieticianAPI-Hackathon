package runner;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

	//@RunWith(Cucumber.class) 
	@CucumberOptions(features ="src/test/resources/features",
	glue= {"stepdefinitions","MorbidityAPI","RecipesAPI","AppHooks"},
	plugin={"pretty",
			"rerun:target/failedrerun.txt",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			},
		
	//},"html:target/HtmlReports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
   monochrome = true,
	dryRun = false,
	
			 publish = true
			 	 )
	public class MasterTestRunner extends io.cucumber.testng.AbstractTestNGCucumberTests 
	{

	}