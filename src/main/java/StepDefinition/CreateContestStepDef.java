package StepDefinition;

import org.openqa.selenium.By;
import Base.BaseClass;
import Pages.CreateContestPage;
import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.junit.Assert; 


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
		String scheduleConfirmation=contest_creation.scheduleContest();
		Assert.assertEquals(scheduleConfirmation, "Contest created successfully");	    
	}

	@Then("^check contest status after scheduling contest$")
	public void check_contest_status_after_scheduling_contest() {
		contest_creation= new CreateContestPage();
		String contestStatusAfterScheduling=contest_creation.checkContestStatus_Ready();
		Assert.assertEquals("READY",contestStatusAfterScheduling);
		
	}
	@And("^admin applies contest name and state filters to search contest")
	public void apply_filters()
	{
		contest_creation= new CreateContestPage();
		contest_creation.contest_filters();
	} 
	@Then("^verifies if contest exists")
	public void verification_of_createdContest()
	{
		String contestName=driver.findElement(By.xpath("//div[contains(text(),'"+CreateContestPage.contestname+"')]")).getText();
		Assert.assertEquals(prop.getProperty("contestName"), contestName);
	}
	@Then("^move contest to DRAFT state")
	public void contest_to_DRAFT()
	{
		contest_creation= new CreateContestPage();
		contest_creation.ready_To_Draft();
		String contestStatustoVerify=contest_creation.checkContestStatus_Draft();
		Assert.assertEquals("DRAFT",contestStatustoVerify );
	}
	@And("^Delete the contest")
	public void deleteContest()
	{
		contest_creation= new CreateContestPage(); 
		String deleteConfirmation=contest_creation.delete_Contest();
		Assert.assertEquals(deleteConfirmation,"Contest Deleted Successfully.");		
	}
	@Then("^close the chromebrowser")
	public void close()
	{
		driver.close();
	}
	
	
	

}
