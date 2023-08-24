package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
features = {"src/main/resources/appfeatures/class.feature"}
,glue = {"steps"}
,dryRun =false
,publish = true
,plugin = {"pretty","html:target/HTML/Result.html",   //preety folder karto for report 
		"junit:target/XML/Result.xml",
		"json:target/jsonReports/cucumber-report.json"
/*"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  --->compile---> test---> verify	*/}

)

public class LoginRunner extends AbstractTestNGCucumberTests {

}
