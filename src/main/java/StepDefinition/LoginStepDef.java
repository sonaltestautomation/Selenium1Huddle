package StepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.graph.NetworkBuilder;

import Base.BaseClass;
import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends BaseClass {
	WebDriver driver;
	WebElement next;
	LoginPage login;
	
	@Given("^user is already on login page")
	public void user_is_already_on_login_page()
	{
		BaseClass base= new BaseClass();
		base.initialization();
	}
	@When("^title of page is 1Huddle Admin")
	public void page_title()
	{
		String pageTitle= driver.getTitle();
		Assert.assertEquals("1Huddle Admin", pageTitle);
	}
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_uname_pswd(String username, String password)
	{
		login=new LoginPage();
		WebElement uname= driver.findElement(By.xpath("//input[@id='user-email']"));
		uname.sendKeys(username);
		next=driver.findElement(By.xpath("//button[@class=\"submit_icon mat-icon-button\"]"));
		next.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement pswd=driver.findElement(By.xpath("//input[@id=\"user-password\"]"));		
		pswd.sendKeys(password);			
	}
	@And("^user clicks on login button")
	public void login()
	{
		WebElement loginButton= driver.findElement(By.xpath("//button[@class=\"submit_icon mat-icon-button\"]"));
		loginButton.click();		
	}
	@Then("^user is on Dashboard page")
	public void dashboard_page()
	{
		String dashboard_text=driver.findElement(By.xpath("//li[@class=\"breadcrumb-item ng-star-inserted\"]")).getText();
		Assert.assertEquals("Dashboard", dashboard_text);
	}
	@Then("^close the browser")
	public void close_Browser()
	{
		driver.close();
	}

}
