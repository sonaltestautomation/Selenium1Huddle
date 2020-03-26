package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="//input[@id='user-email']")
	public WebElement userName;
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
}
