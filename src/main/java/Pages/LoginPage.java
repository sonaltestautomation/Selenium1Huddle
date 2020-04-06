package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="//input[@id='user-email']")
	WebElement userName;
	
	
	@FindBy(xpath="//button[@class='submit_icon mat-icon-button']")
	WebElement nextButton;
	
	
	@FindBy(xpath="//input[@id='user-password']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='submit_icon mat-icon-button']")
	WebElement loginButton;
	
	@FindBy(xpath="//li[@class='breadcrumb-item ng-star-inserted']")
	public WebElement dashboardText;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login_To_AdminPannel()
	{
		userName.sendKeys(prop.getProperty("username"));
		nextButton.click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		password.sendKeys(prop.getProperty("password"));
		loginButton.click();	
		
	}
	public String homepageTitle()
	{
		return driver.getTitle();
		
	}
}
