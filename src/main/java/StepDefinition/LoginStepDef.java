package StepDefinition;
import org.testng.Assert;

import Base.BaseClass;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends BaseClass {
	
	LoginPage login;
	
	@Given("^user is already on login page")
	public void user_is_already_on_login_page()
	{
		BaseClass base= new BaseClass();
		base.initialization();
	}
	@When("^title of page is 1Huddle Admin")
	public void validate_page_title()
	{
		login=new LoginPage();
		String pageTitle= login.homepageTitle();
		Assert.assertEquals("1Huddle Admin",pageTitle);
	}
	@Then("^user logs into app")
	public void user_logsIn()
	{
		login=new LoginPage();
		login.login_To_AdminPannel();
		
	}
	@Then("^user is on Dashboard page")
	public void dashboard_page()
	{
		String dashboard_text=login.dashboardText.getText();
		Assert.assertEquals("Dashboard", dashboard_text);
	}
	@Then("^close the browser")
	public void close_Browser()
	{
		driver.close();
	}

}
