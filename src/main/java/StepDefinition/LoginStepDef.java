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

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	WebDriver driver;
	WebElement next;
	Properties prop;
	FileInputStream fp;
	@Given("^user is already on login page")
	public void user_is_already_on_login_page()
	{
		//System.setProperty("webDriver.chrome.driver", "C:\\Users\\sachin.mengade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		try {
			fp= new FileInputStream("C:\\Users\\sachin.mengade\\Desktop\\sachin\\1huddle-selenium\\config.properties");
			prop= new Properties();
			try {
				prop.load(fp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sachin.mengade\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	@When("^title of page is 1Huddle Admin")
	public void page_title()
	{
		String pageTitle= driver.getTitle();
		Assert.assertEquals("1Huddle Admin", pageTitle);
	}
	@Then("^user enters username and password")
	public void user_enters_uname_pswd()
	{
		
		WebElement uname= driver.findElement(By.xpath("//input[@id='user-email']"));
		uname.sendKeys("sha@codewalla.com");
		next=driver.findElement(By.xpath("//button[@class=\"submit_icon mat-icon-button\"]"));
		next.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement pswd=driver.findElement(By.xpath("//input[@id=\"user-password\"]"));		
		pswd.sendKeys("pass123");			
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

}
