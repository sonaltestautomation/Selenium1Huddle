package runner;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

//import com.vimalselvam.cucumber.listener.Reporter;

import com.cucumber.listener.Reporter;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		//features="C:\\Users\\sachin.mengade\\Desktop\\sachin\\1huddle-selenium\\Selenium1Huddle\\src\\main\\java\\Features\\Contest.feature"
		//,glue= {"StepDefinition"}
		//features="E:\\1huddle\\Automation\\Selenium\\Selenium1Huddle\\src\\main\\java\\Features\\Contest.feature"
		features="E:\\1huddle\\Automation\\Selenium\\Selenium1Huddle\\src\\main\\java\\Features",
		glue= {"StepDefinition"},
		//plugin= {"pretty","html:test-output","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extentReport.html"}
		plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extentReport.html"}
		
		)

public class TestRunner{
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("E:\\1huddle\\Automation\\Selenium\\Selenium1Huddle\\extent-config.xml"));
	}
	
}