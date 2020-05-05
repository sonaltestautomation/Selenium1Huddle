package runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
//@RunWith(Cucumber.class)
@CucumberOptions(
		//features="C:\\Users\\sachin.mengade\\Desktop\\sachin\\1huddle-selenium\\Selenium1Huddle\\src\\main\\java\\Features\\Contest.feature"
		//,glue= {"StepDefinition"}
		//features="E:\\1huddle\\Automation\\Selenium\\Selenium1Huddle\\src\\main\\java\\Features\\Contest.feature"
		features="E:\\1huddle\\Automation\\Selenium\\Selenium1Huddle\\src\\main\\java\\Features"
		,glue= {"StepDefinition"}
		
		)

public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;
 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}
