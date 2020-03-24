package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		//features="C:\\Users\\sachin.mengade\\Desktop\\sachin\\1huddle-selenium\\src\\main\\java\\Features\\Login.feature"
		//,glue= {"StepDefinition"}
		features="E:\\1huddle\\Automation\\Selenium\\Selenium1Huddle\\src\\main\\java\\Features\\Login.feature"
		,glue= {"StepDefinition"}
		
		)

public class TestRunner {

}

