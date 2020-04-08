package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import Base.BaseClass;
import Pages.CreateContestPage;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateContestStepDef extends BaseClass{
	LoginPage login;
	BaseClass base;
	CreateContestPage contest_creation;
	
	@Given("^Admin logs into app")
	public void login_To_App()
	{
		base= new BaseClass();
		base.initialization();
		login= new LoginPage();
		login.login_To_AdminPannel();
		
	}
	@Then("^admin creates contest")
	public void create_contest()
	{
		contest_creation= new CreateContestPage();
		contest_creation.create_New_Contest();
		String contestnameOnBreadcrum=driver.findElement(By.xpath("//li[contains(text(),'"+CreateContestPage.contestname+"')]")).getText();
		Assert.assertEquals(prop.getProperty("contestName"), contestnameOnBreadcrum);
		
	}
	@Then("^check contest status after creating contest$")
	public void check_contest_status_after_creating_contest() {
		
	driver.findElement(By.xpath("//li[contains(text(), 'Contests ')]")).click();
	contest_creation= new CreateContestPage();
	String contestStatustoVerify=contest_creation.checkContestStatus_Draft();
	Assert.assertEquals("DRAFT",contestStatustoVerify );
	String contestnameOnPage= driver.findElement(By.xpath("//div[contains(text(),'"+CreateContestPage.contestname+"')]")).getText();
	Assert.assertEquals(prop.getProperty("contestName"), contestnameOnPage);
	}

	@Then("^admin schedules contest$")
	public void admin_schedules_contest() {
		
		contest_creation= new CreateContestPage();
		contest_creation.scheduleContest();
	    
	}

	@Then("^check contest status after scheduling contest$")
	public void check_contest_status_after_scheduling_contest() {
	   
	}



}
