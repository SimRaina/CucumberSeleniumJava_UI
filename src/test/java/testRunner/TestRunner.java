package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\simra\\Desktop\\CucumberSeleniumJava_UI\\Features\\OrangeHRM.feature",
	    //features = "@target/rerun.txt",
		glue = "stepDefinitions",
		dryRun=false,
	    tags= "@End2End",	
	   // tags=  "Sanity and @Regression",
	   //tags="@Sanity or @Regression", 
	   //tags="@End2End or ~@Sanity and ~@Regression",
		monochrome=true,
		plugin= {"pretty","html:test-output.html",
		         "json:json_output",
		         "junit:junit_xml_output/cucum.xml",
		         "rerun:target/rerun.txt"}  //Failure feature along with line no
		)
public class TestRunner {
	
	
	
	

}
